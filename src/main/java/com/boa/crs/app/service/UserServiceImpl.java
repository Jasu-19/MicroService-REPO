package com.boa.crs.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.crs.app.entity.UserEntity;
import com.boa.crs.app.repo.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void addUser(UserEntity user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}

	@Override
	public UserEntity findUser(Long UserID) {
		return userRepo.findById(UserID).get();
		
		
	}

	// Approval by ADmin 
	// Add Professor 
	// Registration of Studepnt 
	// Add Admin 
	
}
