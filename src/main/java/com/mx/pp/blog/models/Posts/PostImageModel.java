package com.mx.pp.blog.models.Posts;

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
@Table(name = "image_post")
public class PostImageModel {
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
	 * Post
	 */
	@JsonManagedReference("post-image")
	// @JsonBackReference("post-image")
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_post")
	private PostModel post;

	/**
	 * 
	 */
	public PostImageModel() {
	}

	/**
	 * @param id
	 * @param secureURL
	 * @param publicID
	 * @param post
	 */
	public PostImageModel(Long id, String secureURL, String publicID, PostModel post) {
		this.id = id;
		this.secureURL = secureURL;
		this.publicID = publicID;
		this.post = post;
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
	 * return the value of the propertie post
	 *
	 * @return post
	 */
	public PostModel getPost() {
		return post;
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
	 * sets the value of the property post
	 *
	 * @param post the post to set
	 */
	public void setPost(PostModel post) {
		this.post = post;
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
