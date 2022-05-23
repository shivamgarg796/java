package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number of Students you want to enter");
//		int number=sc.nextInt();
//		
//		System.out.println("Enter the Roll Number :");
//		int roll=sc.nextInt();
//		
//		System.out.println("Enter the Name :");
//		String name=sc.nextLine();
//		
//		System.out.println("Enter the marks :");
//		int marks=sc.nextInt();
		
		Student s=new Student();
		s.setRoll(1001);
		s.setName("nrupul");
		s.setMarks(500);
		s.show();
		

	}

}
