package com.cloud.ribbon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class RibbonController {

	@Resource
	private RestTemplate restTemplate;

	@RequestMapping("/ribbon/getName")
	public String getName() {
		System.out.println("cd RibbonController");
		String url = "http://cloud-server/getName";
		return restTemplate.getForObject(url, String.class);
	}
}