package com.app.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.backend.model.User;
import com.app.backend.repository.UserRepositoy;

@RestController
public class UserController {
	
	@Autowired
	private UserRepositoy userRepositoy;
	
	  /**
	   * Get all users list.
	   *
	   * @return the list
	   */
//	@GetMapping("/users")
//	public List<User> getAllUsers() {
//	    return userRepositoy.findAll();
//	}
//	  
//
//	@GetMapping("/welcome")
//	public String hello() {
//		return "Welcome to STS";
//	}
//	  
//	
//	public User pushUser(User u) {
//		return userRepositoy.save(u);
//	}  
	  
	  
	  
	  
	  
}
