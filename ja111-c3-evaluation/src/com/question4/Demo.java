package com.question4;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the USERNAME");
		String username=sc.next();
		
		System.out.println("Enter the PASSWORD");
		String password=sc.next();
		
		System.out.println("Enter the MOBILE");
		String mobile=sc.next();
		
		System.out.println("Enter the EMAIL");
		String email=sc.next();
		
		Customer c1=new Customer();
		c1.setUsername(username);
		c1.setPassword(password);
		c1.setMobileNumber(mobile);
		c1.setEmail(email);
		
		
		

	}

}
