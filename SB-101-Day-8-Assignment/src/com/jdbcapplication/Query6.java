package com.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query6 {

	 public static void main(String[] args) {


         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             System.out.println("Problem with loading the driver");
         }

         String cs ="jdbc:mysql://localhost:3306/db2";

         try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {
             PreparedStatement ps=conn.prepareStatement("select * from employee where salary < 80000");

             ResultSet rs=ps.executeQuery();

             while(rs.next()){
                 int r=rs.getInt("empid");
                 String n=rs.getString("name");
                 String a=rs.getString("address");
                 int m=rs.getInt("salary");

                 System.out.println("Eid IS :"+r);
                 System.out.println("Name is :"+n);
                 System.out.println("Address is :"+a);
                 System.out.println("Salary is :"+m);

                 System.out.println("=================================");
             }

         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }

     }
}
