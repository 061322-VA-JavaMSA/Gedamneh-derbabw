package com.revature.models;

import java.util.Date;
import java.util.Objects;

public class Employee {


	private int employeeid;
	private String fname;
	private String lname;
	private Date dob;
	private String email;
	private String username ;
	private String password;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, email, employeeid, fname, lname, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email) && employeeid == other.employeeid
				&& Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob
				+ ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	public Employee(int employeeid, String fname, String lname, Date dob, String email, String username,
			String password) {
		super();
		this.employeeid = employeeid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	
	
	
}
