package com.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="cloud-server")
interface Service {
	
	@RequestMapping(value="/getName")
	public String getName();
	
}