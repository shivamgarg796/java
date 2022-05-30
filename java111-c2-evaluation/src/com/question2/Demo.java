package com.question2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many students objects to be created :");
		int number=sc.nextInt();
		
		Student[] std=new Student[number];
		
		System.out.println("Enter the roll number");
		int rol=sc.nextInt();
		std[0].setRoll(rol);
		
		System.out.println("Enter the name");
		String nam=sc.next();
		std[0].setName(nam);
		
		System.out.println("Enter the address");
		String addres=sc.next();
		std[0].setAddress(addres);
		
		System.out.println("Enter the roll number");
		int mark=sc.nextInt();
		std[0].setMarks(mark);
		
		std[0].printDetail();
	}

}
