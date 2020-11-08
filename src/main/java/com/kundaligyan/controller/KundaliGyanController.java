package com.kundaligyan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kundaligyan.entity.User;
import com.kundaligyan.service.UserService;

@RestController
public class KundaliGyanController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/set-user" , method = RequestMethod.POST , produces = "application/json")
	public String setUser(@RequestBody User user)
	{
		String message = userService.setUser(user);
		return message;
	}

	@RequestMapping(value = "/get-all-user" , method = RequestMethod.GET , produces = "application/json")
	public List<User> getAllUser()
	{
		List<User> userList = userService.getUser();
		return userList;
	}

}
