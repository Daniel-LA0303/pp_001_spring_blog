package com.mx.pp.blog.services.comment.dto;

public class CommentUpdateDTO {

	/**
	 * comment
	 */
	private String comment;

	/**
	 * 
	 */
	public CommentUpdateDTO() {
	}

	/**
	 * @param comment
	 */
	public CommentUpdateDTO(String comment) {
		this.comment = comment;
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
	 * sets the value of the property comment
	 *
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
