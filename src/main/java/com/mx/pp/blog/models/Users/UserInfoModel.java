package com.mx.pp.blog.models.Users;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "bio")
	private String biography;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "phone")
	private String phone;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private UsersModel user;

	public UserInfoModel() {
	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
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

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
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
	}

	public UsersModel getUser() {
		return user;
	}

	public void setUser(UsersModel user) {
		this.user = user;
	}
	
	
	
}
