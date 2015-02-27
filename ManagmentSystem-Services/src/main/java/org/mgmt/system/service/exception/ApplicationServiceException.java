package org.mgmt.system.service.exception;

/**
 * @author NUNCSYS-241
 *
 */
public class ApplicationServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5960746273654767316L;
	
private String message;
	
	public ApplicationServiceException(){
		super();
	}

	public ApplicationServiceException(String message) {
		super(message);
		this.message = message;
	}
	public ApplicationServiceException(Exception e) {
		super(e);
		this.message = e.getMessage();
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}
