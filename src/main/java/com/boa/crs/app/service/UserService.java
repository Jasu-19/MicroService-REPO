package com.boa.crs.app.service;

import com.boa.crs.app.entity.UserEntity;

public interface UserService {
	public void addUser(UserEntity user);
	public UserEntity findUser(Long UserID);
	void approveUser(Long UserID, boolean isValid);

}
