package com.mx.pp.blog.services.users.dto;

public class UserAllInfoDTO {

	/**
	 * name
	 */
	private String name;

	/**
	 * password
	 */
	private String password;

	/**
	 * email
	 */
	private String email;

	/**
	 * age
	 */
	private int age;

	/**
	 * gender
	 */
	private String gender;

	/**
	 * city
	 */
	private String city;

	/**
	 * country
	 */
	private String country;

	/**
	 * biography
	 */
	private String biography;

	/**
	 * website
	 */
	private String website;

	/**
	 * phone
	 */
	private String phone;

	/**
	 * 
	 */
	public UserAllInfoDTO() {
	}

	/**
	 * @param name
	 * @param password
	 * @param email
	 * @param age
	 * @param gender
	 * @param city
	 * @param country
	 * @param biography
	 * @param website
	 * @param phone
	 */
	public UserAllInfoDTO(String name, String password, String email, int age, String gender, String city,
			String country, String biography, String website, String phone) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.country = country;
		this.biography = biography;
		this.website = website;
		this.phone = phone;
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
	 * return the value of the propertie email
	 *
	 * @return email
	 */
	public String getEmail() {
		return email;
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
	 * return the value of the propertie phone
	 *
	 * @return phone
	 */
	public String getPhone() {
		return phone;
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
	 * sets the value of the property email
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * sets the value of the property phone
	 *
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
