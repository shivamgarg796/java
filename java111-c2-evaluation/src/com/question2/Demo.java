package com.question2;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many students objects to be created :");
		int num=sc.nextInt();
		
		Student[] std=new Student[num];
		for(int i=0;i<std.length;i++) {
			System.out.println("Enter Student "+(i+1)+"Details");
			System.out.println("===========================");

			
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			
			System.out.println("Enter the name");
			String name=sc.next();
			
			System.out.println("Enter the address");
			String address=sc.next();
			
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			System.out.println("===========================");

			std[i]=new Student();
			std[i].setRoll(roll);
			std[i].setName(name);
			std[i].setAddress(address);
			std[i].setMarks(marks);
			
		}
		for(int i=0;i<std.length;i++) {
			System.out.println("===========================");
			System.out.println("Student "+(i+1)+"Details");
			
			System.out.println("Roll number :"+std[i].getRoll());
		
			System.out.println("Name :"+std[i].getName());
			
			System.out.println("Address :"+std[i].getAddress());
			
			System.out.println("Marks :"+std[i].getMarks());
			
			System.out.println("===========================");

			
		}
		
	
	}

}
