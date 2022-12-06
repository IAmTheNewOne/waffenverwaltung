package com.mybackend.MyBackend.api.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybackend.MyBackend.model.RouteModel;
import com.mybackend.MyBackend.persistence.repository.NavigationRepository;
@RestController
@RequestMapping("navigation")
@CrossOrigin
public class NavigationController {

	@Autowired
	private NavigationRepository navRepo;
	
	/**
	 * This API Rest Endpoint provides navigation DTOs for the frontend navigation bar
	 * @return List<RouteModel>
	 */
	@GetMapping(path="/navigation", produces="application/json")
	public List<RouteModel> getRoutes() {
		System.out.println("Send Routes! " + LocalDateTime.now().toString());
		return this.navRepo.getAllRouteModels();
	}
}
