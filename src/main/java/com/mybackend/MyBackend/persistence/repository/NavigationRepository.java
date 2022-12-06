package com.mybackend.MyBackend.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.MyBackend.model.RouteModel;
import com.mybackend.MyBackend.persistence.RepositoryInterface;
import com.mybackend.MyBackend.persistence.data.FakeDB;

@Service
public class NavigationRepository implements RepositoryInterface<RouteModel> {

	@Autowired
	FakeDB db;
	
	public List<RouteModel> getAllRouteModels() {
		return this.db.createRouteModels();
	}

	@Override
	public int save(RouteModel object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RouteModel object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RouteModel get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
