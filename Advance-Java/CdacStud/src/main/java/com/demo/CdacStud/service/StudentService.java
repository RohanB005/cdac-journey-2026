package com.demo.CdacStud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CdacStud.entity.Student;
import com.demo.CdacStud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public void addStudent(Student student) {
		repo.save(student);
	}
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}
}
