package com.demo.CdacStud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.CdacStud.entity.Student;
import com.demo.CdacStud.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "addStudent";
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student) {
		service.addStudent(student);
		return "redirect:/display";
	}
	
	@GetMapping("/display")
	public String displayStudent(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "display";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return "redirect:/display";
		
	}

}
