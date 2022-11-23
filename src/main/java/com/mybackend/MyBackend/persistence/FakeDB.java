package com.mybackend.MyBackend.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mybackend.MyBackend.model.RouteModel;


@Service
public class FakeDB {

	public List<RouteModel> createRouteModels() {
		ArrayList<RouteModel> routeList = new ArrayList<>();
		RouteModel homepageRoute = new RouteModel("Homepage", "homepage");
		RouteModel weaponListRoute = new RouteModel("Waffenarten", "weapon-list");
		
		routeList.add(homepageRoute);
		routeList.add(weaponListRoute);
		
		return routeList;
	}
	
}
