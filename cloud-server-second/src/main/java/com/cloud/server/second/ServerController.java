package com.cloud.server.second;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
	@RequestMapping("/getName")
	public String getName() {
		System.out.println("cd second.ServerController");
		return "cloud-server-second,OK";
	}

}
