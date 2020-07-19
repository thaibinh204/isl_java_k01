package com.example.thymeleafdemo.repository;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.thymeleafdemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	@Modifying
	@Transactional
	@Query("update Student s set s.fullName =:fullname, s.birthday =:birthday, s.math =:math, s.literature=:literature, s.english =:english where s.id =:id")
	void updateById(@Param("id") Long id, @Param("fullname") String fullname, @Param("birthday") Date birthday,
			@Param("math") double math, @Param("literature") double literature, @Param("english") double english);

}
