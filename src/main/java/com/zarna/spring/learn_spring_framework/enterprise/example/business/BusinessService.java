package com.zarna.spring.learn_spring_framework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zarna.spring.learn_spring_framework.enterprise.example.data.DataService;

@Component
public class BusinessService{
	
	//below single line is 'field Injection'
	private DataService dataService;
	
	//this is called 'Setter-based Dependency Injection'
	@Autowired //you will see we dont need to call it. This method is called automatill
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
	
	//Best Dependency Injection is Construction-based Injection
	//we can also use Construction-based Injection. It is useful when you are passing multiple Dependency class objects as parameters in one constructor.
	//So by calling only 1 constructor call/initialization entire object is ready to use
	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public long sumOfData() {
		List<Integer> list = dataService.getData();
		//below line is functional programming. You can simply run a loop and store the sum in a variable
		return list.stream().reduce(Integer::sum).get();
	}

	
}


