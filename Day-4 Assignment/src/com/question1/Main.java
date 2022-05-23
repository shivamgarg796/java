package com.question1;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setRoll(101);
		s1.setName("Nrupul");
		s1.setMarks(450);
		s1.setAge(40);
		
		Student s2=new Student(102,"Yogesh",400,45);
		
		System.out.println("Student 1 details :");
		System.out.println("ROLL NUMBER :"+s1.getRoll());
		System.out.println("NAME :"+s1.getName());
		System.out.println("MARKS :"+s1.getMarks());
		System.out.println("AGE :"+s1.getAge());
		
		System.out.println();
		
		System.out.println("Student 2 details :");
		System.out.println("ROLL NUMBER :"+s2.getRoll());
		System.out.println("NAME :"+s2.getName());
		System.out.println("MARKS :"+s2.getMarks());
		System.out.println("AGE :"+s2.getAge());
		

	}

}
