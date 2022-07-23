//Develop a JDBC application to get the salary of a particular employee, whose Id is given by the user.


package com.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Query1 {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the id :");
        int eid =sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Problem with loading the driver");
        }

        String cs ="jdbc:mysql://localhost:3306/db2";

        try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {

            PreparedStatement ps=conn.prepareStatement("select salary from employee where eid=?");
            ps.setInt(1,eid);

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                int s=rs.getInt("salary");
                System.out.println("Salary is :"+s);
            }
            else
                System.out.println("Employee does not exit...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
