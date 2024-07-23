package com.mx.pp.blog.services.posts.dto;

public class PostImageDTO {

	/**
	 * secureURL
	 */
	private String secureURL;

	/**
	 * publicID
	 */
	private String publicID;

	/**
	 * id post
	 */
	private Long id;

	/**
	 * 
	 */
	public PostImageDTO() {
	}

	/**
	 * @param secureURL
	 * @param publicID
	 */
	public PostImageDTO(String secureURL, String publicID, Long id) {
		this.secureURL = secureURL;
		this.publicID = publicID;
		this.id = id;
	}

	/**
	 * return the value of the propertie id
	 *
	 * @return id
	 */
	public Long getId() {
		return id;
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
	 * sets the value of the property id
	 *
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
