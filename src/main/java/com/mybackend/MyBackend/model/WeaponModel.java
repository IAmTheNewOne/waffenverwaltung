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
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return true;
		}
		else if (obj instanceof WeaponModel) {
			WeaponModel wm = (WeaponModel) obj;
			if (this.id.equals(wm)|| this.name.contentEquals(wm.getID()) || this.name.equals(wm.getName())) {
				System.out.println(this.id.equals(wm));
				System.out.println(this.name.contentEquals(wm.getID()));
				System.out.println(this.name.contentEquals(wm.getName()));
				return true;
			}else {
				return false;
			}
		}
//		else if (this.id.equals(obj.getID()) || this.name.equals(wm.getName()) || this.name.contentEquals(wm.getName())) {
//			return true;
//		}
		return false;
		
	}
			
//			if (obj instanceof WeaponModel)
//		WeaponModel wm = (WeaponModel) obj;
//
//		
//		if (this.id.equals(wm.getID()) || this.name.equals(wm.getName()) || this.name.contentEquals(wm.getName())) {
//			return true;
//		}	
//		return false;
	
}

