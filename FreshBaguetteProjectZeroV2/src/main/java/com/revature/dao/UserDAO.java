package com.revature.dao;

import java.util.List;

import com.revature.model.User;

public interface UserDAO {
	User get(int user_id);

	List<User> getAll();

	User createUser(User user);

	boolean updateUser(User user);

	boolean deleteUser(int user_id);
}
