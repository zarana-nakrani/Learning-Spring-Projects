package com.zarna.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zarna.spring.learn_spring_framework.enterprise.example.web.MyWebController;
import com.zarna.spring.learn_spring_framework.game.GameRunner;

@SpringBootApplication
//below line is executed automatically by @SpringBootApplication we dont need to write it specifically but we add it just for understanding @ComponentScan annotation
@ComponentScan("com.zarna.spring.learn_spring_framework")
//Ypu can also configure multiple packages for component scan
//@ComponentScan({"com.package1", "com.package2"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		//below line creates a Spring Application context and assigns it to 'context' variable
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//When we launch Applicaion Context Spring will create instances of all components and theu are called Beans
		
		//Here also I will have to change the 'game' to SuperContra to run that game
//		MarioGame game = new MarioGame();
//		Pacman game = new Pacman();
//		SuperContraGame game = new SuperContraGame();
		
		//we know GameRunner has dependency on GamingConsole so to run this application we need below 2 lines
		//In real-world application there will be many objects and classes dependent on each other we want to handle them automatically.
		//here we are handling them manually
		//To do it automatically we hand it over to Spring framework
//		GamingConsole game = new MarioGame(); //Step 1
//		GameRunner runner = new GameRunner(game); //Step 2
		
		//I comment above 2 lines after adding @component and @Autowired annotations in GamingConsole and GameRunner and creating Application Context
		
		GameRunner runner = context.getBean(GameRunner.class); //What is a Bean? Instance of a Component is called Bean. So whatever Class(must be annotated by @Component) name you pass as parameter to getBean(), it will return the component instance of that class. We save it in object instance of that class which we pass as parameter
		
		MyWebController controller = context.getBean(MyWebController.class);
		
		System.out.println(controller.returnValueFromBusinessService());
		runner.run();
	}
}
