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
	
	public String abc11112222222222222222355555555() {
		return null;
	}

	public static void main(String[] fdsafdsfdsaf) {
		System.out.println("11111111");
		SpringApplication.run(Application.class, fdsafdsfdsaf);
		System.out.println("gameddd");
	}
}