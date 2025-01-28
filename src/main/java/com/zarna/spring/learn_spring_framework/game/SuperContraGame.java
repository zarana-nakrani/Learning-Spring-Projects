package com.zarna.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContraGame Jump");
	}
	
	public void down() {
		System.out.println("SuperContraGame down");
	}
	
	public void left() {
		System.out.println("SuperContraGame Stop");
	}
	
	public void right() {
		System.out.println("SuperContraGame accelerate");
	}

}
