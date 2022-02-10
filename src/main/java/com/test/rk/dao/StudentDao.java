package com.test.rk.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.rk.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student , Integer> {

	@Query("select t from Student t where t.id=:id")
	List<Student> findAllById(int id);
	
}
