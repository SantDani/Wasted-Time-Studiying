package com.wastedTimeStudiyng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(value = "/getStudentById/{idStudent}")
	private ResponseEntity<Student> getStudentById(@PathVariable("idStudent") int idStudent) {

		Student response = this.studentService.getStudentById(idStudent);

		return response == null ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
			new ResponseEntity<Student>(response, HttpStatus.OK);
	}

	@PutMapping(value = "/updateStudent/{dni}")
	private ResponseEntity<?> updateStudent(@PathVariable("dni") String dni, @RequestBody Student student) {

		this.studentService.updateStudent(dni, student);

		return ResponseEntity.ok().body("Student has been updated succesfully");
	}

	@PostMapping(value = "/createStudent")
	private ResponseEntity<?> createStudent(@RequestBody Student student) {

		this.studentService.createStudent(student);

		return ResponseEntity.ok().body("Student has been created succesfully");
	}

	@DeleteMapping("/deleteStudent/{dni}")
	public ResponseEntity<?> delete(@PathVariable("dni") String dni) {
		this.studentService.deleteStudent(dni);
		return ResponseEntity.ok().body("Student has been deleted successfully.");
	}

}
