package org.mgmt.system.beans.places;

import java.io.Serializable;

/**
 * @author NUNCSYS-241
 * 
 */
public class Places implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7844225936222680821L;
	private String id;
	private String icon;
	private String name;
	private Double lattitude;
	private Double langtitude;
	private Boolean open_now;
	private String photos;
	private String place_id;
	private String reference;
	private String vicinity;
	private String types;
	private Boolean isError = false;
	private PlacesErrorBean error;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the lattitude
	 */
	public Double getLattitude() {
		return lattitude;
	}

	/**
	 * @param lattitude
	 *            the lattitude to set
	 */
	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	/**
	 * @return the langtitude
	 */
	public Double getLangtitude() {
		return langtitude;
	}

	/**
	 * @param langtitude
	 *            the langtitude to set
	 */
	public void setLangtitude(Double langtitude) {
		this.langtitude = langtitude;
	}

	/**
	 * @return the open_now
	 */
	public Boolean getOpen_now() {
		return open_now;
	}

	/**
	 * @param open_now
	 *            the open_now to set
	 */
	public void setOpen_now(Boolean open_now) {
		this.open_now = open_now;
	}

	/**
	 * @return the photos
	 */
	public String getPhotos() {
		return photos;
	}

	/**
	 * @param photos
	 *            the photos to set
	 */
	public void setPhotos(String photos) {
		this.photos = photos;
	}

	/**
	 * @return the place_id
	 */
	public String getPlace_id() {
		return place_id;
	}

	/**
	 * @param place_id
	 *            the place_id to set
	 */
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference
	 *            the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @return the vicinity
	 */
	public String getVicinity() {
		return vicinity;
	}

	/**
	 * @param vicinity
	 *            the vicinity to set
	 */
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}

	/**
	 * @return the types
	 */
	public String getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(String types) {
		this.types = types;
	}

	public Boolean getIsError() {
		return isError;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}

	public PlacesErrorBean getError() {
		return error;
	}

	public void setError(PlacesErrorBean error) {
		this.error = error;
	}
	
}
