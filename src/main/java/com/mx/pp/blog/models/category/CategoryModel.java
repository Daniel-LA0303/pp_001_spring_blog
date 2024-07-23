package com.mx.pp.blog.models.category;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "categories", uniqueConstraints = { @UniqueConstraint(columnNames = "name") })
public class CategoryModel {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * name
	 */
	@Column(name = "name")
	private String name;

	/**
	 * value
	 */
	@Column(name = "value")
	private String value;

	/**
	 * label
	 */
	@Column(name = "label")
	private String label;

	/**
	 * color
	 */
	@Column(name = "color")
	private String color;

	/**
	 * description
	 */
	@Column(name = "description")
	private String description;

	/**
	 * date
	 */
	@Column(name = "date")
	private LocalDateTime date;

	/**
	 * 
	 */
	public CategoryModel() {
	}

	/**
	 * @param id
	 * @param name
	 * @param value
	 * @param label
	 * @param color
	 * @param description
	 * @param date
	 */
	public CategoryModel(Long id, String name, String value, String label, String color, String description,
			LocalDateTime date) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.label = label;
		this.color = color;
		this.description = description;
		this.date = date;
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
