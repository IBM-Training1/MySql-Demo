package com.ibm.MySqlDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.MySqlDemo.Repository.UserRepository;
import com.ibm.MySqlDemo.entity.User;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public int save(User user) {
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
	
	@Override
	public void updateuser(User user) {
		userRepository.save(user);
		
		
	}
	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
		
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	@Override
	public Optional<User> getUserById(int userId) {
		return userRepository.findById(userId);
	}
	

}
