package com.mybackend.MyBackend.persistence.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.mybackend.MyBackend.model.RouteModel;

/**
 * 
 * @author Gabriel Romero
 * The FakeDB imitates a Database for simplification. Every data which is used in the frontend has to derive from this class.
 */
@Service
public class FakeDB {
	//private static ArrayList<WeaponModel> weaponTable = new ArrayList<>();
	private static ArrayList<RouteModel> routeTable = new ArrayList<>();

	public FakeDB() {
		//this.initWeapons();
		this.initRoutes();
	}

	/**
	 * Provides route data
	 * @return
	 */
	public List<RouteModel> createRouteModels() {
		return routeTable;
	}
	
	/**
	 * Provides weapon data
	 * @return
	 */
	//public List<WeaponModel> createWeapons() {    
	//	return weaponTable;
	//}
	
	/**
	 * Initiates the weapon data
	 */
	/* private void initWeapons() {
		WeaponModel weaponG36 = new WeaponModel(
				"HK G36",
				"Sturmgewehr",
				"Das Sturmgewehr G36 ist die Ordonnanzwaffe der deutschen Bundeswehr und Nachfolger des Gewehres G3, das ebenfalls von Heckler & Koch entwickelt und produziert wurde. Beim G36 bestehen wesentliche Bauteile aus glasfaserverstärktem Kunststoff mit Einlagen aus rostfreiem Stahl. Dadurch ist die Waffe relativ leicht. Während der Entwicklung wurde das Gewehr als HK50 bezeichnet.", 
				false, 
				"https://upload.wikimedia.org/wikipedia/commons/6/6a/Gewehr_G36_noBG.png"
				);
		
		WeaponModel weaponP9 = new WeaponModel(
				"HK P9S", 
				"Pistole",
				"Die Heckler & Koch P9S (das Kürzel „P9S“ steht für: „Pistole – 9 Schuss – Spannabzug“) ist eine moderne Selbstladepistole mit Spannabzug und halbstarr verriegeltem (beweglich abgestütztem) Rollenverschluss. Sie wird in den Kalibern 9-mm-Parabellum (auch 9 mm Luger, Dienstbezeichnung 9 mm x 19), .45 ACP (auch .45 Auto) und 7,65 mm Parabellum (für Italien) angeboten. Die P9S ist direkt aus der P9 (ohne Spannabzug) hervorgegangen.",
				false, 
				"https://upload.wikimedia.org/wikipedia/commons/2/21/HK_P9S_PDRM.jpg"
				);
		
		WeaponModel weaponMauser = new WeaponModel(
				"Mauser C96", 
				"Pistole",
				"Die Mauser C96 ist eine der frühesten Selbstladepistolen, die ab 1896 von Mauser produziert wurde.",
				true, 
				"https://upload.wikimedia.org/wikipedia/commons/f/fa/Mauser_C96_M1916_Red_4_noBG.jpg"
				);
		
		WeaponModel weaponM16 = new WeaponModel(
				"M16", 
				"Sturmgewehr",
				"Bezeichnung des US-Department of Defense (DOD) RIFLE 5.56-MM, M16, wurde 1967 als Ordonnanzwaffe der US-Streitkräfte eingeführt. Inzwischen wurde es weitestgehend vom Colt M4, einer kürzeren, verbesserten Variante des AR-15-Systems abgelöst.",
				false, 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/M16A2_noBG.jpg/1920px-M16A2_noBG.jpg"
				);
		
		WeaponModel weaponM16Gleich = new WeaponModel(
				"M16", 
				"Sturmgewehr",
				"Bezeichnung des US-Department of Defense (DOD) RIFLE 5.56-MM, M16, wurde 1967 als Ordonnanzwaffe der US-Streitkräfte eingeführt. Inzwischen wurde es weitestgehend vom Colt M4, einer kürzeren, verbesserten Variante des AR-15-Systems abgelöst.",
				false, 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/M16A2_noBG.jpg/1920px-M16A2_noBG.jpg"
				);
		
		WeaponModel weaponMP5 = new WeaponModel(
				"HK MP5", 
				"Maschinenpistole",
				"Die MP5 ist eine vom deutschen Unternehmen Heckler & Koch (HK) entwickelte Maschinenpistole. Sie war die erste aufschießende Maschinenpistole mit Rollenverschluss, die in Deutschland nach dem Zweiten Weltkrieg entwickelt wurde, und wird hauptsächlich bei Polizei- und Spezialeinheiten in mehr als 50 Staaten eingesetzt. Sie gehört neben der Uzi zu den weltweit am meisten verbreiteten Maschinenpistolen. Die MP5 bildet eine modulare Waffenfamilie. Neben dem Standardmodell, der MP5A, gibt es zwei weitere Hauptvarianten: Die MP5K (K für kurz) hat eine geringere Baulänge und ist zum verdeckten Tragen geeignet. Die Variante MP5SD (SD für schallgedämpft) verfügt über einen besonderen Lauf mit integriertem Schalldämpfer und ist für das Verschießen von Überschallmunition vorgesehen, was sie von den meisten anderen schallgedämpften Waffen auf dem Weltmarkt unterscheidet, die wegen der Schalldämpfung bewusst mit Unterschallmunition bestückt werden. Die MP5 hat das gleiche Verschlusssystem wie das HK G3.",
				false, 
				"https://upload.wikimedia.org/wikipedia/commons/8/81/Heckler_%26_Koch_MP5-2.jpg"
				);
		
		weaponTable.add(weaponG36);
		weaponTable.add(weaponP9);
		weaponTable.add(weaponM16Gleich);
		weaponTable.add(weaponMauser);
		weaponTable.add(weaponM16);
		weaponTable.add(weaponMP5);
		weaponTable.add(weaponMP5);
	}*/
	
	/**
	 * Initiates the route data
	 */
	private void initRoutes() {
		RouteModel homepageRoute = new RouteModel("Homepage", "homepage");
		RouteModel weaponListRoute = new RouteModel("Waffenarten", "weapon-list");
		routeTable.add(homepageRoute);
		routeTable.add(weaponListRoute);
	}
}
