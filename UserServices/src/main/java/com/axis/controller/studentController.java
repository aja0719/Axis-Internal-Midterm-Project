package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Student;
import com.axis.exceptions.IDNotFoundExceptions;
import com.axis.services.StudentService;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController 	 
@RequestMapping("/api")
public class studentController {

	@Autowired    // To save the student registration
	StudentService studentService;
	
	

	@PostMapping("/student/register")
	ResponseEntity<Student> StudsCreation(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.StudsCreation(student),HttpStatus.OK);
	}
	
	@GetMapping("/admin/All studs")
	public List<Student> getAllStudents () {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/both/{userId}")
	ResponseEntity<Student> getStudentById(@PathVariable String userId){
		return new ResponseEntity<Student>(studentService.getStudentById(userId), HttpStatus.OK);
	}
	
	@PutMapping("/admin/updateStudent/{userId}")
	ResponseEntity<Student> updateStudentById(@PathVariable String userId, @RequestBody Student student){
		return new ResponseEntity<Student>(studentService.updateStudentById(userId, student),HttpStatus.OK);
	}
	 
	@DeleteMapping("/admin/deleteStudent/{userId}")
	ResponseEntity<String> deleteStudentById(@PathVariable String userId ){
		return new ResponseEntity<String>(studentService.deleteStudentById(userId), HttpStatus.OK);
	}
	
	@ExceptionHandler(IDNotFoundExceptions.class)
	ResponseEntity<String> MyIdException (IDNotFoundExceptions exception){
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.BAD_REQUEST);
	}
}

