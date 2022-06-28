package com.revature.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.Customer;
import com.revature.daos.CustomerDAO;
import com.revature.models.Product;
import com.revature.util.ConnectionUtil;

public abstract class CustomerPostgres implements CustomerDAO {

	public Customer createCustomer(Customer cus) {
		String sql = "insert into customer (customerid,firstname, lastname, emailid,dob,password,phoneno,employeeid) values (?,?,?,?,?,?,?,?) returning prodid;";
		try (Connection c = ConnectionUtil.getConnectionFromEnv()) {
			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, cus.getcustid());
			ps.setString(2,cus.getFirstName());
			ps.setString(3, cus.getLastName());
			ps.setString(4,cus.getEmailId());
			ps.setDate(5,cus.getDOB());
			ps.setString(6,cus.getPassword());
			ps.setInt(7,cus.getPhoneNo());
			ps.setInt(8,cus.getEmpid());
			

			ResultSet rs = ps.executeQuery(); // return the id generated by the database
			if (rs.next()) {
				cus.setCustid(rs.getInt("customerid"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cus;
	}

	public Customer retrieveCustomerById(int id) {
		// String sql = "select * from users where id = ?;";
		String sql = "select * from customer where customerid=?;";
		Customer customer = null;

		try (Connection c = ConnectionUtil.getConnectionFromEnv()) {
			PreparedStatement ps = c.prepareStatement(sql);

			ps.setInt(1, id); // this refers to the 1st ? in the sql String

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				customer = new Customer();
				customer.setCustid(rs.getInt("customerid"));
				customer.setFirstName(rs.getString("firstname"));
				customer.setLastname(rs.getString("lastname"));
				customer.setEmailId(rs.getInt("emailid"));
				customer.setDOB(rs.getDate("DOB"));
				customer.setPassword(rs.getString("password"));
				customer.setPhoneNo(rs.getInt("phoneno"));
				customer.setEmployeeid(rs.getInt("employeeid"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	public List<Product> retrieveProduct() {
		String sql = "select * from product;";
		List<Product> product = new ArrayList<>();

		try (Connection c = ConnectionUtil.getConnectionFromEnv()) {
			// no user input taken, no need for prepared statement
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				// extract each field from rs for each record, map them to a User object and add
				// them to the users arrayliost
				Product p = new Product();
				p.setProdid(rs.getInt("prodid"));
				p.setProdname(rs.getString("prodname"));
				p.setCatagory(rs.getString("Catagory"));
				p.setSalesQty(rs.getInt("salesqty"));
				p.setInventoryQty(rs.getInt("InventoryQty"));

				product.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}

	public boolean updateProduct(Product p) {
		String sql = "update product set prodname = ?, catagory = ? ,price = ? ,inventoryqty = ? ,salesqty = ? where prodid = ?;";
		int rowsChanged = -1;

		try (Connection c = ConnectionUtil.getConnectionFromEnv()) {
			PreparedStatement ps = c.prepareStatement(sql);

			ps.setString(1, p.getProdname());
			ps.setString(2, p.getCatagory());
			ps.setInt(3, p.getPrice());
			ps.setInt(4, p.getInventoryQty());
			ps.setInt(5, p.getsalesqty());
			ps.setInt(6, p.getProdid());

			rowsChanged = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (rowsChanged < 1) {
			return false;
		}
		return true;
	}

	public boolean deleteProductById(int id) {
		String sql = "delete from product where prodid = ?;";
		int rowsChanged = -1;
		try (Connection c = ConnectionUtil.getConnectionFromEnv()) {
			PreparedStatement ps = c.prepareStatement(sql);

			ps.setInt(1, id);

			rowsChanged = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (rowsChanged < 1) {
			return false;
		}
		return true;
	}

	@Override
	public List<Product> retrieveProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
