package com.question4;

public class Main {

	public static Person generatePerson(Person person) {
		return null;
		
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student(101, "JA-111", 300000);
		Person newStudent=generatePerson(s1);
		
		Instructor i1=new Instructor(456, 45621);
		Person newInstructor=generatePerson(i1);
		
		System.out.println(s1);
		System.out.println(i1);
	}
}
