package com.question1;

public class A {

	public synchronized void d1(B b1) {
		System.out.println("Thread 1 Start execution of d1() METHOD");
	
	try {
		Thread.sleep(5000);
		}
	catch(Exception e) {
	}
	System.out.println("Thread try to call B last () method ");
	b1.last();
	
	}

	public synchronized void last() {
		System.out.println("Inside A last method()");
		
	}
}
