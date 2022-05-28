package com.question2;

public class Student {

	int studId; 
	String studName; 
	double examFee;
	
	public Student(int studId,String studName,double examFee){
		this.studName=studName;
		this.studId=studId;
		this.examFee=examFee;
	}

	public int getStudId() {
		return studId;
	}
	
	public String getStudName() {
		return studName;
	}
	
	public double getExamFee() {
		return examFee;
	}
	
	 public void displayDetails(){
		System.out.println("Student ID :"+studId);
		System.out.println("Student Name :"+studName);
		System.out.println("Exam Fees :"+examFee);
		
	}
	 
	 
	public double payFee(double fees) {
	double fee=examFee+fees;
		return fee;
		
	}

	
	

}
