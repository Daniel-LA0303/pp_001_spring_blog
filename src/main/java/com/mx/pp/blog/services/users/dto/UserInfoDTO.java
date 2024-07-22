package com.mx.pp.blog.services.users.dto;

public class UserInfoDTO {

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
	public UserInfoDTO() {
	}

	/**
	 * @param age
	 * @param gender
	 * @param city
	 * @param country
	 * @param biography
	 * @param website
	 * @param phone
	 */
	public UserInfoDTO(int age, String gender, String city, String country, String biography, String website,
			String phone) {
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
	 * return the value of the propertie gender
	 *
	 * @return gender
	 */
	public String getGender() {
		return gender;
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
	 * sets the value of the property gender
	 *
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
