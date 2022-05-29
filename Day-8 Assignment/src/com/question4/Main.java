package com.question4;

public class Main {

	public static void main(String[] args) {
		
		Animal[ ] obj = new Animal[3];
		
		obj[0]=new Dog();
		
		obj[1]=new Cat();
		
		obj[2]=new Tiger();
		
		obj[0].eat();
		obj[0].walk();
		obj[0].makeNoise();
		
		System.out.println("==============================");
		
		obj[1].eat();
		obj[1].walk();
		obj[1].makeNoise();
		
		System.out.println("==============================");

		obj[2].eat();
		obj[2].walk();
		obj[2].makeNoise();
		
		System.out.println("==============================");
	}

}
