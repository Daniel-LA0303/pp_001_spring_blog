package com.mx.pp.blog.services.category.dto;

public class CategoryDTO {

	/**
	 * name
	 */
	private String name;

	/**
	 * value
	 */
	private String value;

	/**
	 * label
	 */
	private String label;

	/**
	 * color
	 */
	private String color;

	/**
	 * description
	 */
	private String description;

	/**
	 * 
	 */
	public CategoryDTO() {
	}

	/**
	 * @param name
	 * @param value
	 * @param label
	 * @param color
	 * @param description
	 */
	public CategoryDTO(String name, String value, String label, String color, String description) {
		this.name = name;
		this.value = value;
		this.label = label;
		this.color = color;
		this.description = description;
	}

	/**
	 * return the value of the propertie color
	 *
	 * @return color
	 */
	public String getColor() {
		return color;
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
	 * return the value of the propertie label
	 *
	 * @return label
	 */
	public String getLabel() {
		return label;
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
	 * return the value of the propertie value
	 *
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * sets the value of the property color
	 *
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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
	 * sets the value of the property label
	 *
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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
	 * sets the value of the property value
	 *
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
