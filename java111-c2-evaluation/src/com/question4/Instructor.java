package com.question4;

public class Instructor extends Person {

	int instructorId;

	int salary;
	

	public Instructor(int instructorId, int salary) {
		super();
		this.instructorId = instructorId;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}


	
	
}
