package com.skcc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.domain.user.User;
import com.skcc.repository.UserRepository;

@Service
public class UserService {
	
	UserRepository userepository;

	@Autowired
	public UserService(UserRepository userepository) {
			this.userepository = userepository;
					
	}
	
	public void saveUser(User user) {
		userepository.save(user);		
	}
	
	
	
	
}
