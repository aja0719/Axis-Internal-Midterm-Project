package com.axis.services;

import java.util.List;

import com.axis.entity.Fees;

public interface FeesService {

	Fees addFeesToStudent(Fees fees);
	
	List<Fees> getAllFees();
	
	List<Fees> findFeesByName(String name);
}
