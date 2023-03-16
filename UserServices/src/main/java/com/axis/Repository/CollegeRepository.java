package com.axis.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.entity.CollegeDetails;

public interface CollegeRepository extends MongoRepository<CollegeDetails, String>{
	
	

}
