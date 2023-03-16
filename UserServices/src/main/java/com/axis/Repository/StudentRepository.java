package com.axis.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axis.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
