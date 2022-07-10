package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class InsertStudentUseCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll :");
		int roll = sc.nextInt();

		System.out.println("Enter name :");
		String name = sc.next();

		System.out.println("Enter address :");
		String address = sc.next();

		System.out.println("Enter marks :");
		int marks = sc.nextInt();

//		StudentDaoImpl dao=new StudentDaoImpl();
//		String msg=dao.insertStudentDetails(roll, name, address, marks);
//		System.out.println(msg);

		StudentDao dao = new StudentDaoImpl();

		Student s = new Student(roll, name, address, marks);
		String msg = dao.insertStudentDetails2(s);
		System.out.println(msg);

	}

}
