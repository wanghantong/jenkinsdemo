package com.dragon.jenkinsdemo;

public class HelloJenkins {

	public String demo(String value) {
		System.err.println("Param is : " + value);
		return value;
	}

	public static void main(String[] args) {
		System.err.println("Hello Jenkins");
	}

}
