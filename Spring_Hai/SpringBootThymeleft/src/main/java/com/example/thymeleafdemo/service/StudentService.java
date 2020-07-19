package com.example.thymeleafdemo.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.thymeleafdemo.model.Student;

public interface StudentService {
	void save(Student student);

	List<Student> findAll();

	Student findById(Long id);

	Page<Student> findPaginated(Pageable pageable);
	void deleteByid(Long id);
	
	void updatebyId(Long id, String fullName, Date birthday, double math, double literature, double english);

}
