package com.kundaligyan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kundaligyan.entity.User;
import com.kundaligyan.repository.UserRepository;
import com.kundaligyan.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public String setUser(User user) {
		
		userRepository.save(user);
	
		return "User has been saved into DB";
	}

	@Override
	public List<User> getUser() {
		
		List<User> userList= userRepository.findAll();
		
		return userList;
	}

}
