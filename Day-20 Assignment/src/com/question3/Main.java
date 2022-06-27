package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.question1.Student;

public class Main {

	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<>();	

		ls.add(new Student(101, "n1", 450));
		ls.add(new Student(102, "n2", 650));
		ls.add(new Student(103, "n3", 1050));
		ls.add(new Student(104, "n4", 350));
		ls.add(new Student(105, "n5", 950));
		
		 Stream<Student> sStream=ls.stream();

	        List<Employee> employeList=sStream.map(s->{
	            Employee e=new Employee(s.getRoll(),s.getName(),s.getMarks()*1000);
	            return e;
	        }).collect(Collectors.toList());

	        for(Employee e : employeList){
	            System.out.println(e);
	        }


	}

}
