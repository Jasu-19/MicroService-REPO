package com.boa.crs.app.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.app.entity.UserEntity;
import com.boa.crs.app.service.UserService;

@RestController
@RequestMapping("crs-services/api/v1/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	public String addUser(UserEntity entity) {
		userService.addUser(entity);
		return "User added successfully, Waiting for approval.";
	}
	
	@GetMapping
	public UserEntity findUser(Long userId) {
		return userService.findUser(userId);
	}
	
	@PutMapping
	public String updateUser(Long userId, boolean valid) {
		userService.approveUser(userId, valid);
		return "User details updated successfully";
	}
}
