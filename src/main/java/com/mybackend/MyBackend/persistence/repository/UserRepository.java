package com.mybackend.MyBackend.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.MyBackend.model.User;
import com.mybackend.MyBackend.persistence.RepositoryInterface;
import com.mybackend.MyBackend.persistence.data.FakeDB;

@Service
public class UserRepository implements RepositoryInterface<User> {
	
	@Autowired
	FakeDB db;
	
	public List<User> getAllUsers(){
		return this.db.createUser();
	}

	@Override
	public int save(User object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
