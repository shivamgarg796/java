package com.masai.usecases;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentExceptions;

public class UpdateStudent {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImpl();
		
		try {
			String msg = dao.updateExistingStudent(new Student(3,"raghav","blr",569));
			System.out.println(msg);
		} catch (StudentExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
