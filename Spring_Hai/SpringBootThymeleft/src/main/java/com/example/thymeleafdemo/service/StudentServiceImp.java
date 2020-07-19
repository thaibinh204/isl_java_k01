package com.example.thymeleafdemo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.thymeleafdemo.dao.StudentDAO;
import com.example.thymeleafdemo.model.Student;
import com.example.thymeleafdemo.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public void save(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(Long id) {
		return studentRepository.getOne(id);
	}

	@Override
	public Page<Student> findPaginated(Pageable pageable) {
		// TODO Auto-generated method stub
		return studentDAO.findAll(pageable);
	}

	@Override
	public void deleteByid(Long id) {
		studentRepository.deleteById(id);

	}

	@Override
	public void updatebyId(Long id, String fullName, Date birthday, double math, double literature, double english) {
		studentRepository.updateById(id, fullName, birthday, math, literature, english);

	}

}
