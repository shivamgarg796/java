package com.question2;

public class Demo {
	public Demo() {
		this("Hello");
		System.out.println("inside no arg constructor Demo()");
	}
	
	public Demo(String s) {
		this(10);
		System.out.println("inside one String arg constructor Demo(String s)");
		
	}
	
	public Demo(int i) {
		this(10.12f);
		System.out.println("inside one int arg constructor Demo(int i)");
		
	}
	
	public Demo(float f) {
		System.out.println("inside one float arg constructor Demo(float f)");
		
	}
	
	
	public static void main(String[] args) {
		Demo d1=new Demo();
	}
}
