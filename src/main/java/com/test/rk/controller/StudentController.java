package com.test.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rk.entity.Student;
import com.test.rk.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
		
	}
	
	@GetMapping("/{id}")
	public List<Student> getStudent(@PathVariable(name = "id") int id)
	{
		return studentService.getStudent(id);
	}
	
	@DeleteMapping("/{id}")
	public int deleteStudent(@PathVariable(name = "id") int id) {
		return studentService.deleteStudent(id);
	}
}
