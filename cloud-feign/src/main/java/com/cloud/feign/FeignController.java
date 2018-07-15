package com.cloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	
	@Autowired
	private Service service;
	
	@RequestMapping("/feign/getName")
	public String getName() {
		System.out.println("cd FeignController");
		return service.getName();
	}

}
