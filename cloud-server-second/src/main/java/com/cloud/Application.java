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
		return "yes";
	}

	public static void main(String[] aaa) {
		SpringApplication.run(Application.class, aaa);
		System.out.println("game are you right ?");
	}
}