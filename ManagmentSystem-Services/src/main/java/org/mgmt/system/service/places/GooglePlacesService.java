package org.mgmt.system.service.places;

import java.util.List;

import org.mgmt.system.beans.places.Places;
import org.mgmt.system.service.exception.ApplicationServiceException;
import org.springframework.stereotype.Service;

/**
 * @author NUNCSYS-241
 *
 */
@Service
public interface GooglePlacesService{
	
	public List<Places> getGooglePlaces(String lat, String lang, String radius, String type) throws ApplicationServiceException;
	
}
