package com.question2;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private int marks; 
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	
	public void printDetail() {
		System.out.println("Roll No of Student"+getRoll());
		
		System.out.println("Name of Student"+getName());
		
		System.out.println("Address of Student"+getAddress());
		
		System.out.println("Marks of Student"+getMarks());
	}
}