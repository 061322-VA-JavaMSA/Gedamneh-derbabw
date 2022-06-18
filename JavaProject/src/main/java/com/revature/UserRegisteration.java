package com.revature;

import java.util.Scanner;

public class UserRegisteration {
	
	public static void main(String[] args) {
		
		Register register= new Register();
        try(Scanner sc= new Scanner (System.in)){
			
			System.out.println("Please Enter  firstName");
			String firstName=sc.nextLine();
			register.setFirstName(firstName);
			
			System.out.println("Please Enter  LastName");
			String lastName=sc.nextLine();
			register.setLastName(lastName);
			
			System.out.println("Please Enter  emailId");
			String emailId=sc.nextLine();
			register.setEmailId(emailId);
			
			System.out.println("Please Enter  password");
			String password=sc.nextLine();
			register.setPassword(password);
			
			
			System.out.println("Please Enter  Phoneno");
			long phoneno=sc.nextLong();
			register.setPhoneNo(phoneno);
			
			printRegisteredData(register);
			}
		
	}
	
	
	
	
	private static void printRegisteredData(Register register) {
		
		System.out.println(register.getFirstName());
		System.out.println(register.getLastName());
		System.out.println(register.getEmailId());
		System.out.println(register.getPassword());
		System.out.println(register.getPhoneNo());
		
	}

}
	class Register{
             private String  firstName;
             private String  lastName;
             private String  emailId;
             private String  password;
             private long phoneNo;
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public String getEmailId() {
				return emailId;
			}
			public void setEmailId(String emailId) {
				this.emailId = emailId;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public long getPhoneNo() {
				return phoneNo;
			}
			public void setPhoneNo(long phoneNo) {
				this.phoneNo = phoneNo;
			}
             

	
}
