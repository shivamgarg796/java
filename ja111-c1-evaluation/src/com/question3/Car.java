package com.question3;

public class Car {

	String model;
    String companyName;
	String color;
	Engine engine;
	
	public Car() {
		
	}
	
	public Car(String model,String companyName,String color,Engine engine) {
		this.model=model;
		this.companyName=companyName;
		this.color=color;
		this.engine=engine;
	}
}
