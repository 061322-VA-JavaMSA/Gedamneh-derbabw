package com.revature;

import java.sql.Date;
import java.util.Objects;

public class Customer {
	 private int  custid;
	 private String  firstName;
     private String  lastName;
     private String  emailId;
     private Date DOB;
     private String  password;
     private long phoneNo;
	 private int employeeid;
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getCustid() {
		return custid;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public void setCustid(int customerid) {
		this.custid = customerid;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Qty, custid, price, prodid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Qty == other.Qty && Objects.equals(custid, other.custid) && price == other.price
				&& Objects.equals(prodid, other.prodid);
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", prodid=" + prodid + ", price=" + price + ", Qty=" + Qty + "]";
	}
	public Customer(int custid, String prodid, int price, int qty) {
		super();
		this.custid = custid;
		this.prodid = prodid;
		this.price = price;
		Qty = qty;
	}
	
	private String prodid;
	private int price;
	private int Qty;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getcustid() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCustomername(String firstname2) {
		// TODO Auto-generated method stub
		
	}
	public void setLastname(String lastname2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmailid(String emailid2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(Object phoneno2) {
		// TODO Auto-generated method stub
		
	}
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
	public void setEmailId(int i) {
		this.emailId = i;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDOB() {
		// TODO Auto-generated method stub
		return null;
	}
	public Date getDOB() {
		// TODO Auto-generated method stub
		return null;
	}
	public Date getDOB() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDOB(Date date) {
		// TODO Auto-generated method stub
		
	}
	public void setDOB(Date date) {
		// TODO Auto-generated method stub
		
	}
	
	
}
