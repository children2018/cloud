package com.cloud.server.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
	@RequestMapping("/getName")
	public String getName() {
		System.out.println("cd first.ServerController");
		return "cloud-server-first,OK";
	}

}
