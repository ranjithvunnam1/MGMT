package org.mgmt.system.service.places;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.mgmt.system.beans.places.Places;
import org.mgmt.system.beans.places.PlacesErrorBean;
import org.mgmt.system.service.exception.ApplicationServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author NUNCSYS-241
 *
 */
@Service("GooglePlacesService")
public class GooglePlacesServiceImpl implements GooglePlacesService {
	private static final Logger log = Logger.getLogger(GooglePlacesServiceImpl.class);
	
	@Autowired
	private MessageSource messageSource;

	
	private static final String API_KEY = "AIzaSyAKZnXAB24EPw4x9nPYivs5cg50paKJW74";
	private static String API_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
	private static String NEXT_PAGE_TOKEN = null;
	private static final String PHOTO_URL = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&";
	/* (non-Javadoc)
	 * @see org.mgmt.system.service.places.GooglePlacesService#getGooglePlaces()
	 */
	@Override
	@Transactional
	public List<Places> getGooglePlaces(String lat, String lang, String radius, String type) throws ApplicationServiceException {
		log.info("get places services");
		List<Places> places = new ArrayList<Places>();
		try{
			RestTemplate restTemplate = new RestTemplate();
		     
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		    String encodeType = URLEncoder.encode(type,"UTF-8");
		    ResponseEntity<String> result = restTemplate.exchange(new URI(API_URL+"location="+lat+","+lang+"&radius="+radius+"&types="+encodeType+"&name=&key="+API_KEY), HttpMethod.POST, entity, String.class);
		    places = placesParser(result.getBody(),places);
		    System.out.println(result.getBody());
		}catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return places;
	}
	
	/**
	 * @param jsonData
	 * @param places
	 * @return
	 */
	private List<Places> placesParser(String jsonData, List<Places> places){
	        // create an ObjectMapper instance.
			Places entity = null;
	        try {
	        	 ObjectMapper mapper = new ObjectMapper();
	        	    JsonNode node = mapper.readTree(jsonData);
	        	    if(NEXT_PAGE_TOKEN == null || NEXT_PAGE_TOKEN.isEmpty()){
	        	    	
	        	    }else{
	        	    	
	        	    }
	        	    NEXT_PAGE_TOKEN = node.path("next_page_token").asText();
	        	    if(node.path("status").asText().equalsIgnoreCase("OK")){
	        	    	Iterator<JsonNode> albums = node.path("results").iterator();
		        	    while (albums.hasNext()) {
		        	    	entity = new Places();
		        	    	JsonNode nodeElement = albums.next();
		        	    	entity.setId(nodeElement.path("id").asText());
		        	    	entity.setIcon(nodeElement.path("icon").asText());
		        	    	entity.setName(nodeElement.path("name").asText());
		        	    	entity.setLangtitude(nodeElement.path("geometry").path("location").path("lng").asDouble());
		        	    	entity.setLattitude(nodeElement.path("geometry").path("location").path("lat").asDouble());
		        	    	entity.setOpen_now(nodeElement.path("opening_hours").path("open_now").asBoolean());
		        	    	Iterator<JsonNode> photos = nodeElement.path("photos").iterator();
		        	    	while(photos.hasNext()){
		        	    		JsonNode photo = photos.next();
		        	    		log.info("Photo_Ref"+loadPhoto(photo.path("photo_reference").asText()));
		        	    		entity.setPhotos(loadPhoto(photo.path("photo_reference").asText()));
		        	    	}
		        	    	entity.setPlace_id(nodeElement.path("place_id").asText());
		        	    	entity.setReference(nodeElement.path("reference").asText());
		        	    	entity.setVicinity(nodeElement.path("vicinity").asText());
		        	    	entity.setTypes(nodeElement.path("types").asText());
		        	    	places.add(entity);
		        	    }
	        	    }else{
		        	    	System.out.println("Error");
		        	    	entity = new Places();
		        	    	entity.setIsError(true);
		        	    	PlacesErrorBean error = new PlacesErrorBean();
		        	    	error.setMessage(node.path("error_message").asText());
		        	    	error.setStatus(node.path("status").asText());
		        	    	entity.setError(error);
		        	    	places.add(entity);
	                }
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return places;
	}

	/**
	 * @param reference
	 * @return
	 */
	private String loadPhoto(String reference) {
		String photo = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
			 
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			 
			ResponseEntity<String> result = restTemplate.exchange(new URI(PHOTO_URL+"photoreference="+reference+"&key="+API_KEY), HttpMethod.POST, entity, String.class);
			Document doc = Jsoup.parse(result.getBody());
			Element link = doc.select("a").first();
			photo = link.attr("href"); // "http://example.com/"
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return photo;
	}
}
