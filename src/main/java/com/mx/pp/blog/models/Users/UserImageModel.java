package com.mx.pp.blog.models.Users;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_image_profile")
public class UserImageModel {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * secureURL
	 */
	@Column(name = "secure_url")
	private String secureURL;

	/**
	 * publicID
	 */
	@Column(name = "public_id")
	private String publicID;

	/**
	 * user
	 */
	// @JsonBackReference
	@JsonManagedReference("userImage-user")
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private UsersModel user;

	/**
	 * 
	 */
	public UserImageModel() {
	}

	/**
	 * @param id
	 * @param secureURL
	 * @param publicID
	 * @param user
	 */
	public UserImageModel(Long id, String secureURL, String publicID, UsersModel user) {
		this.id = id;
		this.secureURL = secureURL;
		this.publicID = publicID;
		this.user = user;
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
	 * return the value of the propertie user
	 *
	 * @return user
	 */
	public UsersModel getUser() {
		return user;
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

	/**
	 * sets the value of the property user
	 *
	 * @param user the user to set
	 */
	public void setUser(UsersModel user) {
		this.user = user;
	}

}
