package com.example.thymeleafdemo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.thymeleafdemo.model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {
	Page<Student> findAll(Pageable pageable);

}
