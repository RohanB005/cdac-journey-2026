package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;
import com.demo.util.DBConnection;

public class EmployeeDAO {
	Connection con = DBConnection.getConnection();
	
	//Add Employee
	public void addEmployees(Employee e) {
		try {
			String sql = "INSERT INTO EMPLOYEE(empName, department, salary) VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, e.getEmpName());
			ps.setString(2, e.getDepartment());
			ps.setDouble(3, e.getSalary());
			
			ps.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//Display Employees
	public List<Employee> getAllEmployees(){
		List<Employee> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM Employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee e = new Employee();
				
				e.setEmpId(rs.getInt("empId"));
				e.setEmpName(rs.getString("empName"));
				e.setDepartment(rs.getString("department"));
				e.setSalary(rs.getDouble("salary"));
				
				list.add(e);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	//Delete Employee
	public void deleteEmployee(int empId) {
		try {
			String sql = "DELETE FROM Employee WHERE empId=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, empId);
			ps.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
