package com.skcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.domain.user.User;
import com.skcc.service.UserService;

@RestController
public class UserController {
	
	UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us=us;
	}
	
	@RequestMapping(path = "/user", method=RequestMethod.POST)
	public void usersave(@RequestBody User user) {
		us.saveUser(user);
	}

}
