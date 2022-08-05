package com.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {

	private String message;
	
	//OBJECT CREATION PHASE
	public A() {
		System.out.println("Inside constructor of A");
		System.out.println("Object created...!");

	}
	
	//DEPENDENCY SETTER INJECTION
	public void setMessage(String message) {
		this.message = message;
	}

	//INSTANTIATION PHASE 
	public void init() {
		System.out.println("inside init method of A");
		System.out.println("Message is :" + message);
	}
	
	
	
	//SHUTDOWN PHASE
	public void destroy() {
		System.out.println("inside destroy method of A class");
		System.out.println("Object deleted...!");

		
	}
	
	//BUSINESS METHOD ,SERVICE PHASE
	public void funA() {
		System.out.println("inside funA() OF A");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		A aobj = ctx.getBean("a1", A.class);// pulling the A obj
		aobj.funA();

		ClassPathXmlApplicationContext ctx1=(ClassPathXmlApplicationContext)ctx;
		ctx1.close();

//		((ClassPathXmlApplicationContext)ctx).close();
	}
}
