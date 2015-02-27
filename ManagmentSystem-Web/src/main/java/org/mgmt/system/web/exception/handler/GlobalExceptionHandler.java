package org.mgmt.system.web.exception.handler;

import org.apache.log4j.Logger;
import org.mgmt.system.service.exception.ApplicationServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author NUNC-231
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	protected static final Logger log = Logger.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
		//TODO :Stack trace has ro remove
		ex.printStackTrace();
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errMsg", "Exception occured :  " + ex.getMessage());
		return model;
	}
	
	/**
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(ApplicationServiceException.class)
	public ModelAndView handleAllException(ApplicationServiceException ex) {
		//TODO :Stack trace has ro remove
		ex.printStackTrace();
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errMsg", "Exception occured :  " + ex.getMessage());
		return model;
	}
}