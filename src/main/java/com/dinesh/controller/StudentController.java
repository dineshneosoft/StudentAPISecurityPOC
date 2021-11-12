package com.dinesh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.dto.ProjectRequest;
import com.dinesh.modal.Project;
import com.dinesh.modal.Student;
import com.dinesh.repository.ProjectRepository;
import com.dinesh.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	ProjectRepository projectRepository;
	
	
	/*
	 * @PostMapping("registerStudent") public Student registerStudent(@RequestBody
	 * Student student) { return studentRepository.save(student); }
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello User";
	}
	
	
	  @PostMapping("registerStudent") 
	  public Student registerStudent(@RequestBody Student student) 
	  { 
		  return studentRepository.save(student); 
	  }
	 
	@GetMapping("/findAllStudents")
	public List<Student> findAllStudents()
	{
		List<Student> student = new ArrayList<>();
		
		studentRepository.findAll().forEach(student1 -> student.add(student1));
		return student;
	}
	@GetMapping("/findByStudentId/{id}")
	public Optional<Student> findByStudentId(@PathVariable int id)
	{
		return studentRepository.findById(id);
	}

}
