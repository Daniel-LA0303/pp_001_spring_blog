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
@Table(name = "user_info")
public class UserInfoModel {

	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * age
	 */
	@Column(name = "age")
	private int age;

	/**
	 * gender
	 */
	@Column(name = "gender")
	private String gender;

	/**
	 * city
	 */
	@Column(name = "city")
	private String city;

	/**
	 * country
	 */
	@Column(name = "country")
	private String country;

	/**
	 * biography
	 */
	@Column(name = "bio")
	private String biography;

	/**
	 * website
	 */
	@Column(name = "website")
	private String website;

	/**
	 * phone
	 */
	@Column(name = "phone")
	private String phone;

	/**
	 * user
	 */
	@JsonManagedReference("userInfo-user")
	// @JsonBackReference
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private UsersModel user;

	/**
	 * 
	 */
	public UserInfoModel() {
	}

	/**
	 * @param id
	 * @param age
	 * @param gender
	 * @param city
	 * @param country
	 * @param biography
	 * @param website
	 * @param phone
	 * @param user
	 */
	public UserInfoModel(Long id, int age, String gender, String city, String country, String biography, String website,
			String phone, UsersModel user) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.country = country;
		this.biography = biography;
		this.website = website;
		this.phone = phone;
		this.user = user;
	}

	/**
	 * return the value of the propertie age
	 *
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * return the value of the propertie biography
	 *
	 * @return biography
	 */
	public String getBiography() {
		return biography;
	}

	/**
	 * return the value of the propertie city
	 *
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * return the value of the propertie country
	 *
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * return the value of the propertie gender
	 *
	 * @return gender
	 */
	public String getGender() {
		return gender;
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
	 * return the value of the propertie phone
	 *
	 * @return phone
	 */
	public String getPhone() {
		return phone;
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
	 * return the value of the propertie website
	 *
	 * @return website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * sets the value of the property age
	 *
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * sets the value of the property biography
	 *
	 * @param biography the biography to set
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}

	/**
	 * sets the value of the property city
	 *
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * sets the value of the property country
	 *
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * sets the value of the property gender
	 *
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * sets the value of the property phone
	 *
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * sets the value of the property user
	 *
	 * @param user the user to set
	 */
	public void setUser(UsersModel user) {
		this.user = user;
	}

	/**
	 * sets the value of the property website
	 *
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

}
