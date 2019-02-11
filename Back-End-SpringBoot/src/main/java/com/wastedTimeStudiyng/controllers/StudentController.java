package com.wastedTimeStudiyng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wastedTimeStudiyng.pojos.Student;
import com.wastedTimeStudiyng.service.StudentService;

@RestController
@RequestMapping("/wasted-time-studying/api/students")
public class StudentController {

	 @Autowired
	 private StudentService studentService;

	 /*
	  We could make a copy of the response objects, why? The mutable objects
	  */
	 
	 @GetMapping(value = "/getStudents")
	 private ResponseEntity<List<Student>> getStudents() {
		 
		 List<Student> response = this.studentService.getStudents();
		 
		 return response == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
				 				new ResponseEntity<List<Student>>(response, HttpStatus.OK);
	 }
	        
}
