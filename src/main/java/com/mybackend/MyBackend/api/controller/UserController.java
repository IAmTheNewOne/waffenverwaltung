package com.mybackend.MyBackend.api.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybackend.MyBackend.model.User;
import com.mybackend.MyBackend.persistence.repository.UserRepository;
import com.mybackend.MyBackend.services.FilterUser;

@RestController
@RequestMapping("user")
@CrossOrigin

public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	/**
	 * This API Rest Endpoint provides navigation DTOs for the frontend navigation bar
	 * @return List<RouteModel>
	 */
	@GetMapping(path="/all-users", produces="application/json")
	public List<User> getUser() {
		System.out.println("Send all user! " + LocalDateTime.now().toString());

		List<User>User = this.userRepo.getAllUsers();
		List<User>validUser = FilterUser.getValidUsers(User);
		
		return validUser;
	}
	
}

//List<User>validEmail = FilterUser.getUserValidEmail(this.userRepo.getAllUsers());
//List<User>validPW = FilterUser.getUserValidPW(this.userRepo.getAllUsers());
