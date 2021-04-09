package com.ibm.MySqlDemo.Service;

import java.util.List;
import java.util.Optional;

import com.ibm.MySqlDemo.entity.User;

public interface IUserService {
	int save(User user);

	void updateuser(User user);

	void deleteUser(int userId);

	List<User> getUsers();

	Optional<User> getUserById(int userId);

}
