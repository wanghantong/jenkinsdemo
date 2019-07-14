package com.dragon.jenkinsdemo;

import org.springframework.stereotype.Component;

@Component
public class HelloDI {

	public void diDemo(String value) {
		System.err.println("this is DI demo.");
	}
}
