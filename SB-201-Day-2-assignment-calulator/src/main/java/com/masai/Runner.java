package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationLayer pl=ctx.getBean("pl", PresentationLayer.class);
		System.out.println("The Sum is :" +pl.sum(5,6));
		System.out.println("==========================");
		System.out.println("The Multiplication is :"+pl.mul(5,6));
		System.out.println("==========================");
		System.out.println("The Substraction is :"+pl.sub(50,25));
		System.out.println("==========================");
	}
}
