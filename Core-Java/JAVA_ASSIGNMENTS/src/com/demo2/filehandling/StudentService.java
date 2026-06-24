package com.demo2.filehandling;

import java.io.*;
import java.util.*;

public class StudentService {
	
	private ArrayList<Student> list = new ArrayList<>();
	private final String FILE_NAME = "students.csv";
	
	public void loadFromFile() {
		try {
			File f = new File(FILE_NAME);
			if(!f.exists()) return;
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				list.add(new Student (
						Integer.parseInt(data[0]),
						data[1],
						data[2],
						data[3]
			));
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void saveToFile() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
			
			for(Student s : list) {
				bw.write(s.toCSV());
				bw.newLine();
			}
			
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addStudent(Student s) {
		for(Student st:list) {
			if(st.getStudid() == s.getStudid()) {
				System.out.println("ID already exists");
				return;
			}
		}
		list.add(s);
	}
	
	public void updateStudent(int id, String name, String degree, String email) {
		for(Student s : list) {
			if(s.getStudid() == id) {
				s.setName(name);
				s.setDegree(degree);
				s.setEmail(email);
				System.out.println("Updated Successfully");
				return;
			}
		}
		System.out.println("Student not found");
	}
	
	public void deleteStudent(int id) {
		list.removeIf(s -> s.getStudid() == id);
	}
	
	public void displayAll() {
		if (list.isEmpty()) {
			System.out.println("No records found!");
			return;
		}
		for(Student s : list) {
			s.display();
		}
	}
}
