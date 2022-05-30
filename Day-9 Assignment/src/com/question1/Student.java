package com.question1;
import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;    
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public char getGrade() {
		return grade;
	}
	
	
	public void displayDetails() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the roll number");
		int roll=sc.nextInt();
		
		System.out.println("Enter the Name of Student");
		String name=sc.next();
		
		System.out.println("Enter the marks of the student");
		int marks =sc.nextInt();
		
		Student s=new Student(roll,name,marks);
		char grad=calculateGrade(marks);
		s.setGrade(grad);
		
		System.out.println(s);
	}
	
	@Override
	public String toString() {
		return "Roll no"+"="+roll+" "+"Name"+"="+name+" "+"Marks"+"="+"="+marks+" "+"Grade"+"="+grade;
	}
	
	private char calculateGrade(int mark) {
		
		if( mark >= 500) {
			
			setGrade('A');
		}
		
		
		else if (mark < 500 && mark >= 400 ) {
			
			setGrade('B');
		}
		
			
		else if(mark <400) {
			
			setGrade('C');
		}
		return getGrade();
		
	}
}
