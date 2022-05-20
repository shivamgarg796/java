package com.day3;

public class Student {
	
	int roll;
	
	String name;
	
	int marks;
	
	void displayStudentDetails(int roll,String name,int marks) {
		
		System.out.println("Roll is "+roll);
		
		System.out.println("Name is "+name);
		
		System.out.println("Marks is "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Student().displayStudentDetails(36,"shivam",400);
		new Student().displayStudentDetails(25,"deepak",450);
		}

}

