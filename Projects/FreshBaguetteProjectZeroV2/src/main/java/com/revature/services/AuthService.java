package com.revature.services;

import com.revature.dao.UserDAO;
import com.revature.dao.UserPostgres;
import com.revature.exceptions.LoginException;
import com.revature.model.User;

public class AuthService {
	private UserPostgres ps = new UserPostgres();
	
	public User login(String username, String password) throws LoginException {
		// if username/password passed are null, throws an exception
		if(username == null || password == null) {
			throw new LoginException();
		}
		
		User u = ps.get(username);
		// if no user of that name has been retrieved/if pass don't match, throw an exception
		if(u == null || !u.getPassword().equals(password)) {
			throw new LoginException();
		}
		return u;
	}
}
