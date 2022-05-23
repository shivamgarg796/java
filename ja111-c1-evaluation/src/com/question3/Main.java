package com.question3;

public class Main {

	public static void main(String[] args) {
		Engine e=new Engine();
		
		Car c1=new Car();
		
		Car c2=new Car("Harrier","Tata","black",e);
		
		c2.engine.rmp=10000;
		c2.engine.power=110;
		c2.engine.manufacturer="tata";
		
		
		System.out.println("Car Model :"+c2.model);
		System.out.println("Car Company Name :"+c2.companyName);
		System.out.println("Car Color"+c2.color);
		System.out.println("Car RPM :"+c2.engine.rmp);
		System.out.println("Car power :"+c2.engine.power);
		System.out.println("Car Engine Manufacturer :"+c2.engine.manufacturer);
		
		c2.engine.enableTurbo();
	

	}

}
