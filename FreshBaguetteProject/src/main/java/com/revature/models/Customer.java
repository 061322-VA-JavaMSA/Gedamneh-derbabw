package com.revature.models;

import java.sql.Date;
import java.util.Objects;

public class Customer {
	public int getCustid() {
		return Custid;
	}
	public void setCustid(int custid) {
		this.Custid = custid;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
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
		return Objects.hash(Qty, Custid, price, prodid);
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
		return Qty == other.Qty && Objects.equals(Custid, other.Custid) && price == other.price
				&& Objects.equals(prodid, other.prodid);
	}
	@Override
	public String toString() {
		return "Customer [Custid=" + Custid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Emailid="
				+ Emailid + ", DOB=" + DOB + ", Password=" + Password + ", Phoneno=" + Phoneno + ", empid=" + empid
				+ ", prodid=" + prodid + ", price=" + price + ", Qty=" + Qty + "]";
	}
	//@Override
	//public String toString() {
		//return "Customer [custid=" + Custid + ", prodid=" + prodid + ", price=" + price + ", Qty=" + Qty + "]";
	//}
	public Customer(int custid,String  customername, int prodid, int price, int qty) {
		super();
		this.Custid = custid;
		this.prodid = prodid;
		this.price = price;
		Qty = qty;
	}
	private int Custid;
	private String Firstname;
	private String Lastname;
	private String  Emailid;
	private Date  DOB;
	private String Password;
	private String Phoneno;
	private int empid;
	private int prodid;
	private int price;
    private int Qty;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustid(int custid) {
		
		return custid;
	}
	
  
	
	public String getCustomername() {
		return Firstname;
	}
	public void setCustomername(String customername) {
		this.Firstname = customername;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
