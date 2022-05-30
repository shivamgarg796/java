package com.question2;
import java.util.Scanner;

public class Child extends Parent {
	public Child(int n) {
		super(n);
	}

	@Override
    void method1() {
		if(getNumber()>=1 && getNumber()<=10) {
			System.out.println("The number is "+getNumber());
		}
		else
		System.out.println("Invalid number");
		
	}
	
	@Override
    void method3() {
		System.out.println("method 3 of child class");
	}
	
	void method4() {
		System.out.println("method 4 of child class");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in the range 1 to 10");
		int num=sc.nextInt();
		Parent p=new Child(num);
		p.method1();
		p.method2();
		p.method3();
		((Child) p).method4();
		
	}
}
