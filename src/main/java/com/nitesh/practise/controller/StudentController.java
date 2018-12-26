package com.nitesh.practise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitesh.practise.model.Student;
import com.nitesh.practise.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping
	public Student saveStudent (@RequestBody Student student) {
		return this.studentService.saveStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudent(){
		return this.studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") String userId) {
		return this.studentService.getStudentById(userId);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@RequestBody Student student) {
		this.studentService.deleteStudent(student);
	}
}
