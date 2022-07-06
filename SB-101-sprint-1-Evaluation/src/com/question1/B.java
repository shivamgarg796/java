package com.question1;

public class B {

	public synchronized void d2(A a1) {
		System.out.println("Thread 1 Start execution of d2() METHOD");
	
	try {
		Thread.sleep(5000);
		}
	catch(Exception e) {
	}
	System.out.println("Thread try to call A last () method ");
	a1.last();
	}
	public synchronized void last() {
		System.out.println("Inside B last method()");
	}
	
}
