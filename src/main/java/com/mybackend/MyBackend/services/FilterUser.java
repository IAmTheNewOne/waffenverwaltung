package com.mybackend.MyBackend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybackend.MyBackend.model.User;
import com.mybackend.MyBackend.persistence.data.FakeDB;

public class FilterUser {
	
	@Autowired
	FakeDB db;
	

	
	public static boolean validEmail (User user) {
		boolean validEmail = false;
		
		if (user.getEmail().contains("@") && user.getEmail().contains(".")) {
			validEmail = true;
		}
		else {
			validEmail = false;
		}
		return validEmail;
	}
	
	public static boolean validPW (User user) {
		boolean validPW = false;
		
		if (user.getPasswort().length() >= 8) {
			validPW =true;
		}
		else {
			validPW = false;
		}
		return validPW;
	}
	
	public static List<User> getValidUsers(List<User>User){
		List<User>validUser = new ArrayList<>();
		int sizeUserRepo = User.size();
		User currentUser;
		
		for (int i = 0; i<sizeUserRepo; i++) {
			currentUser = User.get(i);
			
			if(validEmail(currentUser) == true && validPW(currentUser) == true) {
				validUser.add(currentUser);
			}
			else {
				continue;
			}
		}
		return validUser;
	}

}


//public static List<User> getUserValidEmail (List<User> User){
//List<User> validEmail = new ArrayList<>();
//int sizeUserRepo = User.size();
//User currentUser;
//
//for (int i = 0; i < sizeUserRepo; i++) {
//	currentUser = User.get(i);
//	
//	if (currentUser.getEmail().contains("@") && currentUser.getEmail().contains(".")) {
//		validEmail.add(currentUser);
//	}
//	else {
//		continue;
//	}
//}		
//return validEmail;
//}
//
//public static List<User> getUserValidPW (List<User> User){
//List<User>validPW = new ArrayList<>();
//int sizeUserRepo = User.size();
//User currentUser;
//
//for (int i = 0; i < sizeUserRepo; i++) {
//	currentUser = User.get(i);
//	
//	if (currentUser.getPasswort().length() >= 8) {
//		System.out.println(currentUser.getPasswort().length());
//		validPW.add(currentUser);
//	}
//	
//}	
//return validPW;
//}
