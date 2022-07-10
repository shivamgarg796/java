package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class SetGraceMarksUseCase5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();

		StudentDao dao = new StudentDaoImpl();

		boolean res = dao.giveGraceMarks(marks);

		System.out.println(res);

	}
}
