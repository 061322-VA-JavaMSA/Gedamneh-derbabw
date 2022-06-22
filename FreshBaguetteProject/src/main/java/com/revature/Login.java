package com.revature;

import java.util.Scanner;

public class Login {

	
	public static void main(String[] args) {
		
		
		try(Scanner sc= new Scanner (System.in)){
			
			System.out.println("Please Enter You User Name");
			String userName=sc.nextLine();
			
			System.out.println("Please Enter You PassWord");
			String password=sc.nextLine();
			
			
			if("Gedam".equals(userName)&& "Password".equals(password)) {
				
				System.out.println("User Succesfully Login");}
			
				else {
					
					System.out.println("Please Enter Your Credential Correctly");
				}
				}
			}
}
