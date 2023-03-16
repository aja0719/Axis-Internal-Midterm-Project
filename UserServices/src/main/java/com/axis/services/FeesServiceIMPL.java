package com.axis.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.Repository.FeesRepository;
import com.axis.entity.Fees;

@Service
public class FeesServiceIMPL implements FeesService {

	
	@Autowired
	FeesRepository feesRepository;

	@Override
	public Fees addFeesToStudent(Fees fees) {		
		return feesRepository.save(fees);
	}

	@Override
	public List<Fees> findFeesByName(String name) {

		return feesRepository.findFeesByName(name);
	}

	@Override
	public List<Fees> getAllFees() {
		// TODO Auto-generated method stub
		return feesRepository.findAll();
	}
	
}
