package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;
import com.demo.utility.DBUtil;

public class ProductDaoImpl implements ProductDao{
	static Connection con;
	static {
		con = DBUtil.getMyConnection();
	}
	@Override
	public List<Product> findAll(){
		PreparedStatement pst = con.prepareStatement("select * from product");
		ResultSet rs=pst.executeQuery();
		List<Product> plist = new ArrayList<>();
		Product p = null;
		while(rs.next()) {
			if(rs.getDate(5)!=null) {
				p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDate(5).toLocalDate());
				
			}
			plist.add(p);
		}
		return plist;
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
	

}
@Override
public boolean saveProduct(Product p) {
	PreparedStatement pst = con.prepareStatement("insert into product values (?,?,?,?,?)");
	pst.setInt(1, p.getPid());
	pst.setString(2, p.getPname());
	pst.setInt(3, p.getQty());
	pst.setDouble(4, p.getPrice());
	pst.setDate(5, java.sql.Date.valueOf(p.getMfgdate()));
	int n = pst.executeUpdate();
	return n>0;
}catch(SQLException e) {
	e.printStackTrace();
}
return false;
}
@Override
public Product findById(int pid) {
	PreparedStatement pst;
	try {
		pst = con.prepareStatement("Select * from product where pid=?");
		pst.setInt(1, pid);
		ResultSet rs = ps.executeQuery();
	}
}