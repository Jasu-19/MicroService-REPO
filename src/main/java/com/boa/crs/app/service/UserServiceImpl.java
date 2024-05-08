package com.boa.crs.app.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.crs.app.entity.UserDetailsEntity;
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
	
	@Override
	public void approveUser(Long UserID,boolean isValid) {
		var user = userRepo.findById(UserID).get();
		if(Objects.nonNull(user)) {
			UserDetailsEntity detailsEntity = user.getUserEntity();
			detailsEntity.setValid(isValid);
			user.setUserEntity(detailsEntity);
			userRepo.save(user);
		}
	}

	// Approval by ADmin 
	// Add Professor 
	// Registration of Studepnt 
	// Add Admin 
	
}
