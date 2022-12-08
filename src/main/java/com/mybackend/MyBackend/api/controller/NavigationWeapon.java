package com.mybackend.MyBackend.api.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mybackend.MyBackend.model.WeaponModel;
import com.mybackend.MyBackend.persistence.repository.WeaponRepository;
import com.mybackend.MyBackend.services.WeaponFilter;
@RestController
@RequestMapping("weapon")
@CrossOrigin

public class NavigationWeapon {

	@Autowired
	private WeaponRepository weapRepo;
		
	/**
	 * This API Rest Endpoint provides navigation DTOs for the frontend navigation bar
	 * @return List<WeaponModel>
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/weapons", produces="application/json") //Sorgt das dafür, das nur GET-Anfragen und JSON zugelassen werden?
	
	public List<WeaponModel> getWeapons() {
				
		System.out.println("Send Weapons! " + LocalDateTime.now().toString());
		
		List<WeaponModel> allWeaponModels = new ArrayList<>();
		List<WeaponModel> currentWeaponModels = new ArrayList<>();
		
		allWeaponModels = this.weapRepo.getAllWeaponModels();	//holen aller Waffen
		//System.out.println(allWeaponModels.size());
		currentWeaponModels = WeaponFilter.getCurrentWeapons(allWeaponModels); //Methoden-Aufruf zum Filtern doppelter und aktueller Waffen
		//System.out.println(currentWeaponModels.size());
		
		return currentWeaponModels;
	}
}
