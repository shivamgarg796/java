package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Student;
import com.masai.exceptions.StudentExceptions;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String insertStudentDetails(int roll, String name, String address, int marks) {

		String msg = "Not inserted...";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);

			int x = ps.executeUpdate();
			if (x > 0)
				msg = "Inserted Successfully..!";

		} catch (SQLException e) {

			msg = e.getMessage();
		}

		return msg;
	}

	@Override
	public String insertStudentDetails2(Student student) {
		String msg = "Not inserted...";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getMarks());

			int x = ps.executeUpdate();
			if (x > 0)
				msg = "Inserted Successfully..!";

		} catch (SQLException e) {

			msg = e.getMessage();
		}

		return msg;
	}

	@Override
	public int getMarksByRoll(int roll) throws StudentExceptions {

		int marks = -1;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select marks from student where roll =?");
			ps.setInt(1, roll);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				marks = rs.getInt("marks");
			} else {
				StudentExceptions exp = new StudentExceptions("Student does not exists with roll" + " " + roll);
				throw exp;
			}

		} catch (SQLException e) {
//			e.printStackTrace();
			throw new StudentExceptions(e.getMessage());
		}
		return marks;
	}

	@Override
	public Student getStudentByRoll(int roll) throws StudentExceptions {

		Student st = null;
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from student where roll = ? ");
			ps.setInt(1, roll);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int r = rs.getInt("roll");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int m = rs.getInt("marks");

				st = new Student(r, n, a, m);

			} else
				throw new StudentExceptions("Student does not exist with this roll" + " " + roll);

		} catch (SQLException e) {
			e.printStackTrace();

			throw new StudentExceptions(e.getMessage());
		}

		return st;

	}

	@Override
	public List<Student> getAllStudent() throws StudentExceptions {

		List<Student> students = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int r = rs.getInt("roll");
				String n = rs.getNString("name");
				String a = rs.getString("address");
				int m = rs.getInt("marks");

				Student student = new Student(r, n, a, m);
				students.add(student);
			}
			if (students.size() <= 0)
				throw new StudentExceptions("There is no any student");

		} catch (SQLException e) {
			throw new StudentExceptions(e.getMessage());
		}

		return students;

	}

	@Override
	public boolean giveGraceMarks(int marks) {

		boolean flag = false;
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("update student set marks=marks+ ? where marks < 500 ");
			ps.setInt(1, marks);
			int x = ps.executeUpdate();

			if (x > 0)
				flag = true;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return flag;
	}

}
