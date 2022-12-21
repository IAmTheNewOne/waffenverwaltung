package com.mybackend.MyBackend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.MyBackend.model.WeaponModel;
import com.mybackend.MyBackend.persistence.data.FakeDB;

@Service
public class WeaponFilter {
	
	@Autowired
	FakeDB db;
	
	public List<WeaponModel> getFilteredWeapons(List<WeaponModel> allWeaponModels) {
		
		//List<WeaponModel> AllWeaponModels = this.db.createWeaponModels();
		List<WeaponModel> filteredWeaponModels = new ArrayList<>();
		
		int sizeRepo = allWeaponModels.size(); //Hilfsvariable für die For-Schleife
		WeaponModel currentWeapon ;//Hilfsvariable, um in der For-Schleife auf die aktuelle Waffe zuzugreifen

		//For-Schleife: Durchläuft das gesamte Waffenrepository
		for (int i = 0; i < sizeRepo; i++ ) {
			currentWeapon = allWeaponModels.get(i);
			boolean containsWeapon = false;
			
			if(currentWeapon.getDeprecated() == true) {
				continue;
			}
			//prüft, ob die Ausgabeliste leer ist. Wenn ja und Waffe nicht veraltet, dann wird die aktuelle Waffe in die Ausgabeliste gespeichert
			if(filteredWeaponModels.isEmpty()) {
				filteredWeaponModels.add(currentWeapon);
				continue;
			}
			//andernfalls wird mittels folgender For-Schleife geprüft, ob das Waffenobjekt oder der Name bereits in der Liste ist. 
			//Wenn ja, wird die Hilfsvariable containsWeapon auf true gesetzt, die For-Schleife abgebrochen und nicht in die Ausgabeliste hinzugefügt.
			// Wenn nein und die Waffe nicht veraltet ist, wird sie in die Ausgabeliste geschrieben.
			//Andernfalls geht es direkt weiter in der übergeordneten For-Schleife. 
				for (int j = 0; j < filteredWeaponModels.size(); j++) {
					WeaponModel compareWeapon = filteredWeaponModels.get(j);
					
					if(compareWeapon.equals(currentWeapon)) {
						break;
					}
					else {
						filteredWeaponModels.add(currentWeapon);
						break;
					}
					

				}
		}
	return filteredWeaponModels;
	}
	
	
//	@Override
//	public boolean equals(Object o) {
//		if (o == this) {
//			return true;
//		}
//		
//		if (!(o instanceof WeaponModel)) {
//			return false;
//		}
//		
//		WeaponModel w = (WeaponModel) o;
//			
//		return true;
//	}
}