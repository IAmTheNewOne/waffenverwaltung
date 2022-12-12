package com.mybackend.MyBackend.model;

import java.util.UUID;

public class User {
	
	

	private String id;
	private String name;
	private String vorname;
	private String email;
	private String passwort;
	
	public User (String name, String vorname, String email, String passwort) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.vorname = vorname;
		this.email = email;
		this.passwort = passwort;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

}
