package com.question4;

public class Main {

	public static Person generatePerson(Person person) {
		return null;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Person newStudent=generatePerson(s1);
		
		Instructor i1=new Instructor();
		Person newInstructor=generatePerson(i1);
		
		System.out.println(newStudent);
		System.out.println(newInstructor);
	}
}
