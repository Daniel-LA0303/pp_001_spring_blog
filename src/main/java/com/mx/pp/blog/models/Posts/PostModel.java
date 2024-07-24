package com.mx.pp.blog.models.Posts;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.models.comment.CommentModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class PostModel {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * title
	 */
	@Column(name = "title")
	private String title;

	/**
	 * dexcription
	 */
	@Column(name = "description")
	private String description;

	/**
	 * content
	 */
	@Column(name = "content")
	private String content;

	/**
	 * date
	 */
	@Column(name = "date")
	private LocalDateTime date;

	/**
	 * user
	 */
	@JsonManagedReference("post-user")
	// @JsonBackReference("post-user")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private UsersModel user;

	/**
	 * Post image
	 */
	@JsonBackReference("post-image")
	// @JsonManagedReference("post-image")
	@OneToOne(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private PostImageModel postImage;

	@JsonBackReference("post-comments")
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<CommentModel> comments = new HashSet<>();

	/**
	 * 
	 */
	public PostModel() {
	}

	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param content
	 * @param date
	 */
	public PostModel(Long id, String title, String description, String content, LocalDateTime date) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.date = date;
	}

	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param content
	 * @param date
	 * @param user
	 */
	public PostModel(Long id, String title, String description, String content, LocalDateTime date, UsersModel user) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.date = date;
		this.user = user;
	}

	/**
	 * return the value of the propertie content
	 *
	 * @return content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * return the value of the propertie date
	 *
	 * @return date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * return the value of the propertie description
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
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
	 * return the value of the propertie title
	 *
	 * @return title
	 */
	public String getTitle() {
		return title;
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
	 * sets the value of the property content
	 *
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * sets the value of the property date
	 *
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * sets the value of the property description
	 *
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * sets the value of the property title
	 *
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
