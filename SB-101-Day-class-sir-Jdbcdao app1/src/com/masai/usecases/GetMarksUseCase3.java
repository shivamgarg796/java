package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentExceptions;

public class GetMarksUseCase3 {	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int roll=sc.nextInt();
		
		StudentDao dao=new StudentDaoImpl();
		
		
		try {
			int marks = dao.getMarksByRoll(roll);
			
			System.out.println("Student marks :"+marks);
		} catch (StudentExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}

}
