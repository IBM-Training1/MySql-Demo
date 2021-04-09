package com.ibm.MySqlDemo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.MySqlDemo.Service.IUserService;
import com.ibm.MySqlDemo.entity.User;


@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	@PostMapping("/user")
	int createUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/user")
	List<User> getUsers() {
		return userService.getUsers();
	}
	@GetMapping("/user/{id}")
	Optional<User> getOrderById(@PathVariable ("id") int userId) {
		return userService.getUserById(userId);
	}
	@PutMapping("/user/{id}")
	void updateUser(@RequestBody User user,@PathVariable("id") int userId) {
		user.setId(userId);
		userService.updateuser(user);
		
	}
	@DeleteMapping("/user/{id}")
	void deleteorder(@PathVariable("id") int userId) {
		userService.deleteUser(userId);
	}

}
