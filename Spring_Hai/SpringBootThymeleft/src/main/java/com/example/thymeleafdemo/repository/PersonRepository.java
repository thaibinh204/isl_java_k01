package com.example.thymeleafdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.thymeleafdemo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	@Modifying
	@Transactional
	@Query("delete from Person b where b.firstName=:firstname AND b.lastName =:lastname")
	public void deleteByFirstName(@Param("firstname") String firstname, @Param("lastname") String lastname);

	@Query("SELECT b from Person b WHERE b.lastName =:lastname")
	public List<Person> selectByLastName(@Param("lastname") String lastname);

	@Modifying
	@Transactional
	@Query("UPDATE Person b SET b.firstName =:firstname, b.lastName =:lastname WHERE b.id = :id")
	void updateNameById(@Param("id") Long id, @Param("firstname") String firstname, @Param("lastname") String lastname);

}
