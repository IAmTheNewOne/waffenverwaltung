package com.mybackend.MyBackend.model;

import java.util.UUID;

public class WeaponModel {
	
	private String id;
	private String name;
	private String category;
	private String description;
	private boolean deprecated;
	private String image;
	
	
	public WeaponModel (String name, String category, String description, boolean deprecated, String image){
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.category = category;
		this.description = description;
		this.deprecated = deprecated;
		this.image = image;
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean getDeprecated() {
		return deprecated;
	}
	
	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
}
