package com.test.rk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rk.dao.StudentDao;
import com.test.rk.entity.Course;
import com.test.rk.entity.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService {

	@Autowired
	private StudentDao dao;
	
	public Student addStudent(Student student) {
		log.debug("detching this data",student);		
		return dao.save(student);
	}
	
	public List<Student> getStudent(int id){
		log.info("Getting All data for"+id);
		return dao.findAllById(id);
	}

	public int deleteStudent(int id) {
		try {
		dao.deleteById(id);
		return 0;
			
		}catch(Exception e )
		{
			log.info(e.getMessage());
			return 1;
		}
		finally {
			log.info("done");
		}
	}
	
}
