package com.nitesh.practise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nitesh.practise.model.Student;

@Service
public class StudentService implements CrudInterface<Student, String> {

	List<Student> students = new ArrayList<>();

	public StudentService() {
		this.students.add(new Student("ax123", "Nitesh Paudel","Patan Multiple Campus"));
		this.students.add(new Student("bx456", "Kumar Chaulagain", "Kathford"));
		this.students.add(new Student("cx789", "Siva Lamichhane", "Aberdeen"));
	}
	
	@Override
	public Student saveStudent(Student t) {
		this.students.add(t);
		return t ;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudentById(String id) {

		for (Student student : this.students) {

			if(student.getId().equals(id)) {
				return student;
			}
			
		}
		return null;
	}

	@Override
	public Student updateStudent(Student t) {
		for (Student student : this.students) {
			if(student.getId().equals(t.getId())) {
				student.setName(t.getName());
				student.setClg(t.getClg());
			}
		}
		
		return t;
	}

	@Override
	public void deleteStudent(Student t) {
		Student std=this.getStudentById(t.getId());
		this.students.remove(std);
		System.err.print(students);
	}
}
