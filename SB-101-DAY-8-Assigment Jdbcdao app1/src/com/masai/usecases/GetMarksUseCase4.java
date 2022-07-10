package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentExceptions;

public class GetMarksUseCase4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Roll :");
		int roll = sc.nextInt();

		StudentDao dao = new StudentDaoImpl();

		try {
			Student st = dao.getStudentByRoll(roll);

			System.out.println(st);
		} catch (StudentExceptions e) {
			System.out.println(e.getMessage());
		}

	}

}
