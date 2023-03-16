package com.axis.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.Repository.StudentRepository;
import com.axis.entity.Student;
import com.axis.exceptions.IDNotFoundExceptions;

@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired    //  it will create auto-beans 
	StudentRepository studentRepository;

	
	@Override
	public Student StudsCreation(Student student){
		
		return studentRepository.save(student);  // to save data in studentRepository
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(String userID) {
		// TODO Auto-generated method stub
		
		Optional<Student> studs = studentRepository.findById(userID);
		
		if(studs.isPresent())
			return studs.get();
		else 
			throw new IDNotFoundExceptions("No similar student found ! Please check");
		
		}

	@Override
	public Student updateStudentById(String userID, Student student) {
		// TODO Auto-generated method stub
		Optional <Student> studs = studentRepository.findById(userID);
		
		if(studs.isPresent())
			return studentRepository.save(student);
		else
			 throw new IDNotFoundExceptions("No similar ID present to update");
	}

	@Override
	public String deleteStudentById(String userID ) {
		// TODO Auto-generated method stub
		
		Optional<Student> studs = studentRepository.findById(userID);
		
	if(studs.isPresent())
		{
		studentRepository.deleteById(userID);
		
	return "Student is deleted";
		}
		throw new IDNotFoundExceptions("No similar ID present to delete");
	}
}
