package com.question1;

public class Main {

	public static void main(String[] args) {
		
		Manager m1=new Manager("Manufacturing","Automobiles");
		m1.name="Ram";
		m1.age=35;
		m1.phoneNumber="8218799330";
		m1.address="Banglore";
		m1.salary=300000;
		m1.printSalary();
		
		Employee e1=new Employee("Manufacturing","Automobiles");
		e1.name="Shyam";
		e1.age=30;
		e1.phoneNumber="8225652354";
		e1.address="Agra";
		e1.salary=30000;
		e1.printSalary();

	}

}
