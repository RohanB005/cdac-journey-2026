package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Student;
import com.cdac.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	
	public void saveStudent(Student s) {
		repo.save(s);
	}
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public Student getStudentById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}
