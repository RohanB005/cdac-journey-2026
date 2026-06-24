package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdac.entity.Student;
import com.cdac.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("students", 
				service.getAllStudents());
		
		return "index";
	}
	@GetMapping("/add")
	public String addPage() {
		return "addStudent";
	}
	
	@PostMapping("/save")
	public String saveStudent(Student student) {
		service.saveStudent(student);
		
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(
			@PathVariable int id) {
		service.deleteStudent(id);
		
		return "redirect:/";
	}
	
	

}
