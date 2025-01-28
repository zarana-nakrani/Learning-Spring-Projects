package com.zarna.spring.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary is used when you have multiple matching components. That way spring can know which component to autowire.
@Primary
public class Pacman implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Run up");
		
	}

	@Override
	public void down() {
		System.out.println("Run down");
		
	}

	@Override
	public void left() {
		System.out.println("Run Left");
		
	}

	@Override
	public void right() {
		System.out.println("Run Right");
	}
	

}
