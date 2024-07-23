package com.mx.pp.blog.services.posts.dto;

public class PostDTO {

	/**
	 * title
	 */
	private String title;

	/**
	 * description
	 */
	private String description;

	/**
	 * content
	 */
	private String content;

	/**
	 * id user
	 */
	private Long idUser;

	/**
	 * 
	 */
	public PostDTO() {
	}

	/**
	 * @param title
	 * @param description
	 * @param content
	 */
	public PostDTO(String title, String description, String content) {
		this.title = title;
		this.description = description;
		this.content = content;
	}

	/**
	 * @param title
	 * @param description
	 * @param content
	 * @param idUser
	 */
	public PostDTO(String title, String description, String content, Long idUser) {
		this.title = title;
		this.description = description;
		this.content = content;
		this.idUser = idUser;
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
	 * return the value of the propertie description
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * return the value of the propertie idUser
	 *
	 * @return idUser
	 */
	public Long getIdUser() {
		return idUser;
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
	 * sets the value of the property content
	 *
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
	 * sets the value of the property idUser
	 *
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/**
	 * sets the value of the property title
	 *
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
