package com.ittraining.studentmanagement;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

@GetMapping("/students")
public Student getstudent() {
	Student student= new Student();
	student.setStudentId(1l);
	student.setFirstName("Ritu");
	student.setLastName("Magar");
	student.setAddress("New baneshwore");
	return student;
}
@GetMapping("/students/{firstName}")
public String greet(@PathVariable String firstName) {
	return "Hello" +firstName;
}
@PostMapping("/students")
public void saveStudent(@RequestBody Student student) {
	System.out.println("First Name:"+student.getFirstName());
	System.out.println("LastName:"+student.getLastName());
}
}



