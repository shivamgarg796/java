package com.question3;

public class Student {
	
	int roll;
	String name;
	String address;
	String collageName;
	
	public Student(int roll, String name, String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
    public Student(int roll, String name, String address,String collageName) {
    	this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
		
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public int getRoll(){
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setCollageName(String collageName) {
		this.collageName=collageName;
	}
	
	public String getCollageName(){
		return collageName;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT) {
			Student s1=new Student(101,"Nrupul","Banglore");
			s1.detailNit(s1);
			return s1;
		}
		else {
			Student s1=new Student(102,"Vivek","Patna","Uttam Institute");
			s1.detailIns(s1);
			return s1;
		}
		
	}
	
	public void detailNit(Student s) {
		System.out.println("Student from NIT");
		System.out.println("Roll Number: "+s.getRoll());
		System.out.println("Name: "+s.getName());
		System.out.println("Address: "+s.getAddress());
		System.out.println();
	}
	
	public void detailIns(Student s) {
		System.out.println("Student from other college");
		System.out.println("Roll Number: "+s.getRoll());
		System.out.println("Name: "+s.getName());
		System.out.println("Address: "+s.getAddress());
		System.out.println("Institute: "+s.getCollageName());
		System.out.println();
	}
	
	public static void main(String []args) {
		
		getStudent(true);	
		
	    getStudent(false);
		}

}
