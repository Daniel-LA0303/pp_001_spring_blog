package com.mx.pp.blog.models.comment;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.models.Users.UsersModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentModel {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * comment
	 */
	@Column(name = "comment")
	private String comment;

	/**
	 * date
	 */
	@Column(name = "date")
	private LocalDateTime date;

	/**
	 * Post
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_post")
	@JsonManagedReference("post-comments") // Optionally add if you are using bidirectional relationships
	private PostModel post;

	/**
	 * User
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	@JsonManagedReference("user-comments") // Optionally add if you are using bidirectional relationships
	private UsersModel user;

	/**
	 * 
	 */
	public CommentModel() {
	}

	/**
	 * @param id
	 * @param comment
	 * @param date
	 * @param post
	 * @param user
	 */
	public CommentModel(Long id, String comment, LocalDateTime date, PostModel post, UsersModel user) {
		this.id = id;
		this.comment = comment;
		this.date = date;
		this.post = post;
		this.user = user;
	}

	/**
	 * return the value of the propertie comment
	 *
	 * @return comment
	 */
	public String getComment() {
		return comment;
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
	 * return the value of the propertie user
	 *
	 * @return user
	 */
	public UsersModel getUser() {
		return user;
	}

	/**
	 * sets the value of the property comment
	 *
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
	 * sets the value of the property user
	 *
	 * @param user the user to set
	 */
	public void setUser(UsersModel user) {
		this.user = user;
	}

}
