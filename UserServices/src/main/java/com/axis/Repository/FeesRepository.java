package com.axis.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.axis.entity.Fees;


public interface FeesRepository extends MongoRepository<Fees,String>{

	@Query("{'name':?0}")
	List <Fees> findFeesByName(String name);
	
}
