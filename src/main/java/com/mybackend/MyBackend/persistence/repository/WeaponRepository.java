package com.mybackend.MyBackend.persistence.repository;

import java.util.List;
import java.lang.Override;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.MyBackend.model.WeaponModel;
import com.mybackend.MyBackend.persistence.RepositoryInterface;
import com.mybackend.MyBackend.persistence.data.FakeDB;

@Service
	public class WeaponRepository implements RepositoryInterface<WeaponModel> {

		@Autowired
		FakeDB db;
		
		public List<WeaponModel> getAllWeaponModels() {
			return this.db.createWeaponModels();
		}

		@Override
		public int save(WeaponModel object) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(WeaponModel object) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public WeaponModel get(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int delete(String id) {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
