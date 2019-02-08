package com.wastedTimeStudiyng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wastedTimeStudiyng.pojos.Student;
import com.wastedTimeStudiyng.service.StudentService;

@RestController
@RequestMapping("/wasted-time-studying/api/students")
public class StudentController {

	 @Autowired
	 private StudentService studentService;
	 
	 
	 @GetMapping("/getStudents")
	 @ResponseBody
	 private String getStudents(){
		 System.out.println(" KE MAS VEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		 return "connected";
	 }
	 
	
	
}
