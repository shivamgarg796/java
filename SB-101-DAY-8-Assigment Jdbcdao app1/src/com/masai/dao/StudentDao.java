package com.masai.dao;

import java.util.List;

import com.masai.bean.Student;
import com.masai.exceptions.StudentExceptions;

public interface StudentDao {

	public String insertStudentDetails(int roll, String name, String address, int marks);

	public String insertStudentDetails2(Student student);

	public int getMarksByRoll(int roll) throws StudentExceptions;

	public Student getStudentByRoll(int roll) throws StudentExceptions;

	public List<Student> getAllStudent() throws StudentExceptions;
	
	public boolean giveGraceMarks(int marks);
}
