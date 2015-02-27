package org.mgmt.system.beans.admin;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.mgmt.system.beans.custom.validators.Email;
import org.mgmt.system.beans.custom.validators.Phone;

/**
 * @author NUNCSYS-241
 *
 */
public class AdminUserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5306269807627405372L;
	
	private Long id;
	
	@NotBlank(message = "first name is required")
	private String name;
	
	@Email(message = "invalid email id")
	private String email;
	
	@Phone(message = "invalid phone number")
	private String phone;
	
	/**
	 * TODO
	 */
	private String password;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
