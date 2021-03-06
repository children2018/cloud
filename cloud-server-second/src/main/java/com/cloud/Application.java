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
	
	public void a22() {
		
	}
	
	public String abc11112222222222222222355555555() {
		return null;
	}
	
	public void sssss1dsfds5f() {
		
	}

	public static void main(String[] fdsafdsfdsaf) {
		System.out.println("ssdsafdsff34567");
		SpringApplication.run(Application.class, fdsafdsfdsaf);
		System.out.println("gameddd3333333334");
	}
}
