package com.zarna.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("go down in the hole");
	}
	
	public void left() {
		System.out.println("Stop");
	}
	
	public void right() {
		System.out.println("accelerate");
	}

}
