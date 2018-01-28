package com.pluralsight.spring.simpleWebApp.controller;

import org.springframework.http.ResponseEntity;

import com.pluralsight.spring.simpleWebApp.model.User;
import com.pluralsight.spring.simpleWebApp.model.UserInfo;


public interface UserService {
	
	public ResponseEntity<User> getSimpleUser();
	
	public ResponseEntity<UserInfo> getUserInfo(User user);

}
