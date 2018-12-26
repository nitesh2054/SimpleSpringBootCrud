package com.nitesh.practise.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface CrudInterface<T, Pk> {

	List<T> getAllStudents();

	T getStudentById(Pk id);
	
	T saveStudent(T t);
	
	T updateStudent(T t);
		
	void deleteStudent(T t);	 
}
