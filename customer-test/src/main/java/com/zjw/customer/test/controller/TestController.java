package com.zjw.customer.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		String provideRespnse = restTemplate.getForObject("http://provide-test/test", String.class);
		return "customer testController time: " + System.currentTimeMillis()+"<br> provide test response: "+provideRespnse;
	}

}
