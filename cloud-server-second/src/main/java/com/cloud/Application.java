package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.slf4j.LoggerFactory;

@EnableEurekaClient
@SpringBootApplication
public class Application {
	
	//开启软均衡负载
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public String abc() {
		return null;
	}

	public static void main(String[] args) {
		System.out.println("yaya///32143243大厦大厦大厦大厦大厦磊");
		SpringApplication.run(Application.class, args);
		System.out.println("game over...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
}