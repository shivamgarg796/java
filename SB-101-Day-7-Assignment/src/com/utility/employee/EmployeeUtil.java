package com.utility.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeUtil {

	public static Connection provideConnection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Problem with loading the driver");
		}

		String cs = "jdbc:mysql://localhost:3306/db1";

		try {
			conn = DriverManager.getConnection(cs, "root", "..shivam1998..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}
}
