package com.question4;

public class Student {
	 
 private int rollNumber;
	
	private String studentName;
	
	private int marks;
	
	Student(){
		
	}
	
	Student(int rollNumber,String studentName,int marks){
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.marks=marks;
	}
	
	public void setRoll(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public int getRoll() {
		return rollNumber;
	}
	
	public void setName(String studentName) {
		this.studentName=studentName;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public int getmarks() {
		return marks;
	}
	
	public void show() {
		System.out.println("Student Roll Number :"+rollNumber);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student Mark :"+marks);
	}
}


