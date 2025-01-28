package com.zarna.spring.learn_spring_framework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zarna.spring.learn_spring_framework.enterprise.example.business.BusinessService;

//as you can see here BusinessService is the dependency of MyWebController and DataService is the dependency of BusinessService
@Component
public class MyWebController {
	
	@Autowired
	private BusinessService businessService;
	
	public MyWebController(BusinessService businessService) {
		super();
		System.out.println("Calling from MyWebController");
		this.businessService = businessService;
	}

	public long returnValueFromBusinessService() {
		return businessService.sumOfData();
	}
}

