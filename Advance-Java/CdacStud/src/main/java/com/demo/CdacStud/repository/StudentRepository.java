package com.demo.CdacStud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.CdacStud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
