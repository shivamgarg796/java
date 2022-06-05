package com.question1;

public class Demo {

	public static void main(String[] args) {
		ZImpl z1=new ZImpl();
		Z z2=(Z)z1;
		
		z1.draw();
		X x=(X)z2;
		x.show();
		X.hello();
		System.out.println();

		
		z1.sketch();
		Y y=(Y)z2;
		y.display();
		Y.hey();
		System.out.println();
		
		z1.moves();
		
		
		
		
	}
}
