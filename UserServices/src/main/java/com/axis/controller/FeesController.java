package com.axis.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Fees;
import com.axis.exceptions.NameNotFoundException;
import com.axis.services.FeesService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/fees")
public class FeesController {
	
	@Autowired
	FeesService feesService;
	
	@PostMapping("/add")
	ResponseEntity<Fees> addFeesToStudent(@RequestBody Fees fees){
		return new ResponseEntity<Fees>(feesService.addFeesToStudent(fees), HttpStatus.OK);
	}
	
	@GetMapping("/{name}")
	ResponseEntity<List<Fees>> findFeesByName( @PathVariable String name){
	    return new ResponseEntity<List<Fees>>(feesService.findFeesByName(name), HttpStatus.OK);
	}
		
	@GetMapping("/allFees")
	ResponseEntity<List<Fees>> getAllFees(){
	    return new ResponseEntity<List<Fees>>(feesService.getAllFees(), HttpStatus.OK);
	}
	@ExceptionHandler(NameNotFoundException.class)
	ResponseEntity<String> MyIdException (NameNotFoundException exception){
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.BAD_REQUEST);
	}
}