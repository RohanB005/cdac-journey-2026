package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDAO {
	Connection con = DBConnection.getConnection();
	public void addStudent(Student s) {
		try {
			String sql = "INSERT INTO STUDENT(name, age, course) INTO VALUES (?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setString(3, s.getCourse());
			
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//Display
	public List<Student> getAllStudents()
	{
		List<Student> list = new ArrayList<>();
		try {
			String sql = "Select * from student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Student s = new Student();
				
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setCourse(rs.getString("course"));
				
				list.add(s);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}	
			return list;
		}
	
	public void deleteStudent(int id) {
		try {
			String sql = "Delete from student where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
