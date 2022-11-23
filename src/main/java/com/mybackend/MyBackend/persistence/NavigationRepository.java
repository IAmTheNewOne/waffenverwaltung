package com.mybackend.MyBackend.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.MyBackend.model.RouteModel;

@Service
public class NavigationRepository {

	@Autowired
	FakeDB db;
	
	public List<RouteModel> getAllRouteModels() {
		return this.db.createRouteModels();
	}
	
}
