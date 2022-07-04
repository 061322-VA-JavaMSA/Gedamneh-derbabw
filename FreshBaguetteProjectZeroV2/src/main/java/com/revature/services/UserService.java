package com.revature.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.message.Message;

//import com.revature.Customer;
import com.revature.dao.UserDAO;
import com.revature.dao.UserPostgres;
import com.revature.model.User;

public class UserService {
	private static UserDAO ud = new UserPostgres();
	private static Logger log = LogManager.getLogger(UserService.class);
	
	public List<User> getUsers(){
		return ud.getAll();
	}
	
	public User createUser(User u) {
		// logic to validate ussss
		// if ok
	//u = ud.createUser(u);
		User user = ud.createUser(u);
		log.info("User: " + user + " was created.");
		return user;
	}

	

}
