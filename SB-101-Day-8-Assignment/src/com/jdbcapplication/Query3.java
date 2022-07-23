package com.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Query3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String cs = "jdbc:mysql://localhost:3306/db2";

        try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {
            PreparedStatement ps=conn.prepareStatement("ALTER TABLE employee ADD Bonus INT NOT NULL DEFAULT 500");

            boolean x= ps.execute();

            if(!x)
                System.out.println("Bonus added...");
            else
                System.out.println("Bonus not added...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
