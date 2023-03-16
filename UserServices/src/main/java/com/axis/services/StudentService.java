package com.axis.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axis.entity.Student;

@Service
public interface StudentService{

   public Student StudsCreation(Student student);  //Abstract method for registering the student details nd Id creation
   
   List<Student> getAllStudents();
   
   public Student getStudentById(String id);
      
   public Student updateStudentById(String id, Student student);
  
   public String deleteStudentById(String id);

      
}
