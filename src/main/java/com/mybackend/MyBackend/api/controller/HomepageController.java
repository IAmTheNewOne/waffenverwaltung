package com.mybackend.MyBackend.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybackend.MyBackend.model.RouteModel;
import com.mybackend.MyBackend.persistence.NavigationRepository;

/**
 * 
 * @author Gabriel Romero
 *
 */
@RestController
@RequestMapping("homepage")
@CrossOrigin
public class HomepageController {
	
	@Autowired
	private NavigationRepository navRepo;
	
	/**
	 * This API Rest Endpoint provides navigation DTOs for the frontend navigation bar
	 * @return
	 */
	@GetMapping(path="/navigation", produces="application/json")
	public List<RouteModel> getRoutes() {
		System.out.println("Send Routes!");
		return this.navRepo.getAllRouteModels();
	}
	
}
