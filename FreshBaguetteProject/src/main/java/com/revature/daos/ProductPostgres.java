package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Product;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

public class ProductPostgres implements ProductDAO {
	public List<Product> retrieveProducts() {
		String sql = "select * from product;";
		List<Product> product = new ArrayList<>();
		
		try(Connection c = ConnectionUtil.getConnectionFromEnv()){
			// no user input taken, no need for prepared statement
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				// extract each field from rs for each record, map them to a User object and add them to the users arrayliost
				Product p = new Product ();
				p.setProdid(rs.getInt("prodid"));
				p.setProdname(rs.getString("prodname"));
				p.setCatagory(rs.getString("catagory"));
				p.setPrice(rs.getInt("price"));
				p.setSalesQty(rs.getInt("salesqty"));
				p.setInventoryQty(rs.getInt("inventoryqty"));
				
				product.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
	}

}
