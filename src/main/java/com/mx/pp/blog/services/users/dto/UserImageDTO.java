package com.mx.pp.blog.services.users.dto;

public class UserImageDTO {

	/**
	 * secureURL
	 */
	private String secureURL;

	/**
	 * publicID
	 */
	private String publicID;

	/**
	 * 
	 */
	public UserImageDTO() {
	}

	/**
	 * @param secureURL
	 * @param publicID
	 */
	public UserImageDTO(String secureURL, String publicID) {
		this.secureURL = secureURL;
		this.publicID = publicID;
	}

	/**
	 * return the value of the propertie publicID
	 *
	 * @return publicID
	 */
	public String getPublicID() {
		return publicID;
	}

	/**
	 * return the value of the propertie secureURL
	 *
	 * @return secureURL
	 */
	public String getSecureURL() {
		return secureURL;
	}

	/**
	 * sets the value of the property publicID
	 *
	 * @param publicID the publicID to set
	 */
	public void setPublicID(String publicID) {
		this.publicID = publicID;
	}

	/**
	 * sets the value of the property secureURL
	 *
	 * @param secureURL the secureURL to set
	 */
	public void setSecureURL(String secureURL) {
		this.secureURL = secureURL;
	}

}
