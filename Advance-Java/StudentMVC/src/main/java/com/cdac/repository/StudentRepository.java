package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
