package com.question1;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		List<Student> ls = new ArrayList<>();	

		ls.add(new Student(101, "n1", 450));
		ls.add(new Student(102, "n2", 650));
		ls.add(new Student(103, "n3", 1050));
		ls.add(new Student(104, "n4", 350));
		ls.add(new Student(105, "n5", 950));


		ls.stream().filter(s -> s.getMarks() < 800).forEach(s -> System.out.println(s));

	}

}
