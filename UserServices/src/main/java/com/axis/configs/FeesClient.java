package com.axis.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



import com.axis.entity.Fees;

@FeignClient(name="feesclient" , url = "http://localhost:9089/api/f1")
public interface FeesClient {
	
	@GetMapping("/ClgId/{clgId}")
	Fees getFeesByClgId(@PathVariable String clgId);
	
}
