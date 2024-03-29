package com.question1;

public class Student {

	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		super();
	}
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	public int compareTo(Student s) {
		Student s1=this;
		Student s2=s;
		
		if(s1.getMarks()>s2.getMarks())
			return 1;
		else if(s1.getMarks()<s2.getMarks())
			return -1;
		else
			return 0;
	}
	
	
}
