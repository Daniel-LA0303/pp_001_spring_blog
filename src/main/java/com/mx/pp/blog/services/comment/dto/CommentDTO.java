package com.mx.pp.blog.services.comment.dto;

public class CommentDTO {

	/**
	 * comment
	 */
	private String comment;

	/**
	 * Post
	 */
	private Long postID;

	/**
	 * User
	 */
	private Long userID;

	/**
	 * 
	 */
	public CommentDTO() {
	}

	/**
	 * @param comment
	 * @param date
	 * @param postID
	 * @param userID
	 */
	public CommentDTO(String comment, Long postID, Long userID) {
		this.comment = comment;
		this.postID = postID;
		this.userID = userID;
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
	 * return the value of the propertie postID
	 *
	 * @return postID
	 */
	public Long getPostID() {
		return postID;
	}

	/**
	 * return the value of the propertie userID
	 *
	 * @return userID
	 */
	public Long getUserID() {
		return userID;
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
	 * sets the value of the property postID
	 *
	 * @param postID the postID to set
	 */
	public void setPostID(Long postID) {
		this.postID = postID;
	}

	/**
	 * sets the value of the property userID
	 *
	 * @param userID the userID to set
	 */
	public void setUserID(Long userID) {
		this.userID = userID;
	}

}
