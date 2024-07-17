package com.mx.pp.blog.models.Users;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "name"),
		@UniqueConstraint(columnNames = "email") })
public class UsersModel {
	
	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * name
	 */
	@Column(name = "name")
	private String name;

	/**
	 * password
	 */
	@Column(name = "password")
	private String password;

	/**
	 * email
	 */
	@Column(name = "email")
	private String email;

	/**
	 * token
	 */
	@Column(name = "token")
	private String token;

	/**
	 * confirm
	 */
	@Column(name = "confirm")
	private Boolean confirm;

	/**
	 * userInfo
	 */
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private UserInfoModel userInfo;

	/**
	 * 
	 */
	public UsersModel() {
	}

	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param email
	 * @param token
	 * @param confirm
	 * @param userInfo
	 */
	public UsersModel(Long id, String name, String password, String email, String token, Boolean confirm,
			UserInfoModel userInfo) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.token = token;
		this.confirm = confirm;
		this.userInfo = userInfo;
	}

	/**
	 * return the value of the propertie confirm
	 *
	 * @return confirm
	 */
	public Boolean getConfirm() {
		return confirm;
	}

	/**
	 * return the value of the propertie email
	 *
	 * @return email
	 */
	public String getEmail() {
		return email;
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
	 * return the value of the propertie name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * return the value of the propertie password
	 *
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * return the value of the propertie token
	 *
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * return the value of the propertie userInfo
	 *
	 * @return userInfo
	 */
	public UserInfoModel getUserInfo() {
		return userInfo;
	}

	/**
	 * sets the value of the property confirm
	 *
	 * @param confirm the confirm to set
	 */
	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}

	/**
	 * sets the value of the property email
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * sets the value of the property name
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * sets the value of the property password
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * sets the value of the property token
	 *
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * sets the value of the property userInfo
	 *
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfoModel userInfo) {
		this.userInfo = userInfo;
	}

}
