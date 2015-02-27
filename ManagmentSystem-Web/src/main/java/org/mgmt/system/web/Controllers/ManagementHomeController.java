package org.mgmt.system.web.Controllers;

import org.apache.log4j.Logger;
import org.mgmt.system.service.exception.ApplicationServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author NUNCSYS-241
 *
 */
@Controller
public class ManagementHomeController {
	private static final Logger log = Logger.getLogger(ManagementHomeController.class);
		
	@RequestMapping(value = "placeType", method= RequestMethod.GET)
	public String placeType(Model model)throws ApplicationServiceException{
		log.info("requested for placeType us page");
		return "findplace/placeType";
	}
	
	/**
	 * @param model
	 * @return
	 * @throws ApplicationServiceException
	 */
	@RequestMapping(value = "findplace", method= RequestMethod.GET)
	public String services(Model model, @RequestParam (value = "type") String type)throws ApplicationServiceException{
		log.info("requested for services us page");
		model.addAttribute("type", type);
		return "findplace/findplace";
	}
}
