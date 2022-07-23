package com.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Query5 {
	 public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the Id :");
         int id =sc.nextInt();

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             System.out.println("Problem with loading the driver");
         }

         String cs ="jdbc:mysql://localhost:3306/db1";

         try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {

             PreparedStatement ps=conn.prepareStatement("select * from employee where empid=?");
             ps.setInt(1,id);

             ResultSet rs=ps.executeQuery();

             if(rs.next()){
                 int r=rs.getInt("empid");
                 String n=rs.getString("name");
                 String a=rs.getString("address");
                 int m=rs.getInt("salary");

                 System.out.println("Id IS :"+r);
                 System.out.println("Name is :"+n);
                 System.out.println("Address is :"+a);
                 System.out.println("Salary is :"+m);
             }
             else
                 System.out.println("student does not exit...");

         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }

     }

}
