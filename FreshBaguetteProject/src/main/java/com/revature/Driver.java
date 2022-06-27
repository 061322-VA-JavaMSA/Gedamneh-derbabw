package com.revature;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.security.auth.login.LoginException;

import com.revature.models.Task;
import com.revature.models.User;
import com.revature.services.AuthService;
import com.revature.services.ProductService;
import com.revature.services.CustomerService;
import com.revature.services.TaskService;
import com.revature.services.UserService;
import com.revature.util.ConnectionUtil;

public class Driver {
	
	private static  Logger  log = LogManager.getLogger(Driver.class);
	static Scanner scan;
	static AuthService as;
	static UserService us;
	static TaskService ts;
	//static ProductService ps;
	//static CustomerService cs;
	// private static Logger log = LogManager.getLogManager(Driver.class);
	
	   public static void main (String[] args) throws LoginException {
		scan = new Scanner(System.in);
		as = new AuthService();
		us = new UserService();
		ts = new TaskService();
		//ps =new  ProductService();
		//cs =new  CustomerService();
		
		String username = null;
		String password = null;
		
		System.out.println("Please enter username:");
		username = scan.nextLine();
		System.out.println("Please enter password:");
		password = scan.nextLine();
		
		
		log.info(as.login(username, password)); 
		
		try {
			
			Connection c = ConnectionUtil.getHardcodedConnection();
			System.out.println(c.getMetaData().getDriverName());
			java.sql.Statement s = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		List<User> users = us.getUsers();
		for(User u : users) {
			System.out.println(u);
		}	
		// "1; drop table users"
		System.out.println("Create, username:");
		String uname = scan.nextLine();
		System.out.println("Create, password:");
		String pass = scan.nextLine();
		User userTBC = new User();
		userTBC.setUsername(uname);
		userTBC.setPassword(pass);
		log.info(us.createUser(userTBC));
		
		System.out.println("Retrieve tasks for which user id?");
		int userId = Integer.parseInt(scan.nextLine());
		List<Task> tasksForUser = ts.getTasksByUserId(userId);
		for(Task t : tasksForUser) {
			System.out.println(t);
		}
		
	
		//this is where i added my code /////////////////////////////////////////////////////////////////////////////
		
		}
		//scan.close();
			
	}


