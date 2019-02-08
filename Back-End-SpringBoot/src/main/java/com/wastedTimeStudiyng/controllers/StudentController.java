package com.wastedTimeStudiyng.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wastedTimeStudiyng.service.StudentService;

@RestController
//@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/wasted-time-studying/api/students")
public class StudentController {

	 @Autowired
	 private StudentService studentService;
	 
	 
	 @GetMapping(value = "/getStudents", produces = MediaType.TEXT_PLAIN_VALUE)
	 private String getStudents() {
		 System.out.println("Connection");
		 return "connected";
	 }
	
}
