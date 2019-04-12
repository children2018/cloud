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
	
	public String abc11112222222222222222355555555444() {
		return null;
	}

	public static void main(String[] argssssssssssssss111111111112222) {
		System.out.println("y");
		SpringApplication.run(Application.class, argssssssssssssss111111111112222);
		System.out.println("game");
	}
}