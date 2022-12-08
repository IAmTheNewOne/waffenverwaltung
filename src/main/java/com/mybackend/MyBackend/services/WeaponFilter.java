package com.mybackend.MyBackend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybackend.MyBackend.model.WeaponModel;
import com.mybackend.MyBackend.persistence.data.FakeDB;

public class WeaponFilter {
	
	@Autowired
	FakeDB db;
	
	public static List<WeaponModel> getCurrentWeapons(List<WeaponModel> allWeapons) {
		
		List<WeaponModel> currentWeaponModels = new ArrayList<>();
		
		int sizeRepo = allWeapons.size(); //Hilfsvariable für die For-Schleife
		WeaponModel currentWeapon ;//Hilfsvariable, um in der For-Schleife auf die aktuelle Waffe zuzugreifen

		//For-Schleife: Durchläuft das gesamte Waffenrepository
		for (int i = 0; i < sizeRepo; i++ ) {
			currentWeapon = allWeapons.get(i);
			boolean containsWeapon = false;
			
			//prüft, ob die Ausgabeliste leer ist. Wenn ja und Waffe nicht veraltet, dann wird die aktuelle Waffe in die Ausgabeliste gespeichert
			if(currentWeaponModels.isEmpty() && currentWeapon.getDeprecated() == false) {
				currentWeaponModels.add(currentWeapon);	
			}
			//andernfalls wird mittels folgender For-Schleife geprüft, ob das Waffenobjekt oder der Name bereits in der Liste ist. 
			//Wenn ja, wird die Hilfsvariable containsWeapon auf true gesetzt, die For-Schleife abgebrochen und nicht in die Ausgabeliste hinzugefügt.
			// Wenn nein und die Waffe nicht veraltet ist, wird sie in die Ausgabeliste geschrieben.
			//Andernfalls geht es direkt weiter in der übergeordneten For-Schleife.
			else { 
				for (int j = 0; j < currentWeaponModels.size(); j++) {
					if (currentWeaponModels.get(j).getName().contentEquals(currentWeapon.getName()) || currentWeaponModels.contains(currentWeapon)) {
						containsWeapon = true;
						break;
					}
				}
		
				if (currentWeapon.getDeprecated() == false && containsWeapon == false) {
					currentWeaponModels.add(currentWeapon);	
				}
				else {
					continue;
				}
			}
		}
	return currentWeaponModels;
	
	}
}