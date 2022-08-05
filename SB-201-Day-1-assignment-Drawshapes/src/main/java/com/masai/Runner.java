package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	Shapes s;

//	public void setS(Shapes s) {
//		this.s = s;
//	}

	public void draw() {
		s.draw();
	}

	public Runner(Shapes s) {
		super();
		this.s = s;
	}

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Runner r = ctx.getBean(Runner.class, "t");

		r.draw();

	}

}
