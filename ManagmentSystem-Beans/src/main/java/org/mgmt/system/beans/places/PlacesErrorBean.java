package org.mgmt.system.beans.places;

import java.io.Serializable;

public class PlacesErrorBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8917228849203981082L;
	
	private String message;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
