package com.mx.pp.blog.services.users.dto;

public class UserTestDTO {
	
	private String name;
	
	private String password;
	
	private String email;
	
	/*private int age;
	
	private String gender;
	
	private String city;
	
	private String country;
	
	private String bio;
	
	private String website;
	
	private String phone;*/
	
	public UserTestDTO() {
	}
	
	
	
	

	public UserTestDTO(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}





	/*public UserAllInfoDTO(String name, String password, String email, int age, String gender, String city, String country,
			String bio, String website, String phone) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.country = country;
		this.bio = bio;
		this.website = website;
		this.phone = phone;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}*/
	
}
