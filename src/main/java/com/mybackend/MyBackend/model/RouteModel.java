package com.mybackend.MyBackend.model;

import java.util.UUID;

public class RouteModel {
	
	private String id;
	private String label;
	private String route;

	public RouteModel(String label, String route) {
		this.id = UUID.randomUUID().toString();
		this.label = label;
		this.route = route;
	}	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
}
