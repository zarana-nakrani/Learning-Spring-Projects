package com.zarna.spring.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//this is called tight coupling because If I want to run SuperContraGame I will have to remove instance of Mario game and make new 
	//instance of SuperContraGame
	//private MarioGame game;
	
	//Here GameRunner class is dependent on GamingConsole interface. Cuz you will have to always provide object of a class implementing GamingConsole
	@Autowired
	//Spring Framework manages this dependency injection in something called Application Context
	private GamingConsole game;

	//Construtor-based injection
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
