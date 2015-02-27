package org.mgmt.system.web.Controllers.Places;

import java.util.List;

import org.apache.log4j.Logger;
import org.mgmt.system.beans.places.Places;
import org.mgmt.system.service.exception.ApplicationServiceException;
import org.mgmt.system.service.places.GooglePlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author NUNCSYS-241
 *
 */
@Controller
public class PlacesParsingController {
	
	private static final Logger log = Logger.getLogger(PlacesParsingController.class);
	
	@Autowired
	@Qualifier("GooglePlacesService")
	GooglePlacesService googlePlacesService;

	/**
	 * @return
	 */
	@RequestMapping(value = "getPlaces", method = RequestMethod.GET)
    public @ResponseBody List<Places> getAllPlaces(@RequestParam("lattitude") String lat, @RequestParam("langtitude") String lang, @RequestParam("radius") String radius, @RequestParam("type") String type) throws ApplicationServiceException{
        log.info("Start getting places from json."+lat+lang+radius);
        return googlePlacesService.getGooglePlaces(lat, lang, radius, type);
    }
}
