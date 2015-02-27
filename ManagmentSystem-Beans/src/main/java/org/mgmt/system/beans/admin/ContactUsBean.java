package org.mgmt.system.beans.admin;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.mgmt.system.beans.custom.validators.Email;
import org.mgmt.system.beans.custom.validators.Phone;

/**
 * @author NUNCSYS-241
 *
 */
public class ContactUsBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1322851119453622440L;
	
	private Long id;
	
	@NotBlank(message = "first name is required")
	private String firstName;
	
	private String lastName;
	
	@Email(message = "invalid email id")
	private String email;
	
	@Phone(message = "invalid phone number")
	private String phone;
	
	@NotBlank(message = "description is required")
	private String description;
	private Date sent_date;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the sent_date
	 */
	public Date getSent_date() {
		return sent_date;
	}
	/**
	 * @param sent_date the sent_date to set
	 */
	public void setSent_date(Date sent_date) {
		this.sent_date = sent_date;
	}
}
