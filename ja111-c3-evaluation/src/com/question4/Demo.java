package com.question4;
import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

public class Demo {
	
	public static boolean checkUsername(String username) {
		boolean res=Pattern.matches("[A-Za-z]{3,8}", username);
		return res;
	}
	
	public static boolean checkPassword(String password) {
		boolean res=Pattern.matches("[a-zA-Z0-9]{8}",password);
		return res;
	}
	
	public static boolean checkMobile(String mobile) {
		boolean res=Pattern.matches("[6789]{1}[0-9]{9}",mobile);
		return res;
	}
	public static boolean checkEmail(String email) {
		boolean res=Pattern.matches("^(.+)@(.+)$",email);
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the USERNAME of min length 3 and max length 8 alphabets only");
		String username=sc.next();
		boolean name=Demo.checkUsername(username);

		
		System.out.println("Enter the PASSWORD of min length 3 and max length 8 alphanumeric only");
		String password=sc.next();
		boolean pass=Demo.checkPassword(password);
		
		System.out.println("Enter the MOBILE of 10 digits number");
		String mobile=sc.next();
		boolean mob=Demo.checkMobile(mobile);
		
		System.out.println("Enter the EMAIL");
		String email=sc.next();
		boolean emai=Demo.checkEmail(email);
		
		if(name==true && pass==true && mob == true && emai==true) {
			
		Customer c1=new Customer();
		c1.setUsername(username);
		c1.setPassword(password);
		c1.setMobileNumber(mobile);
		c1.setEmail(email);
		
		System.out.println("Information saved succesfully");
		
		System.out.println("Username is :"+c1.getUsername());
		System.out.println("Password is :"+c1.getPassword());
		System.out.println("Mobile is :"+c1.getMobileNumber());
		System.out.println("Email is :"+c1.getEmail());
		}
		else {
			
		if(name==false) {
			System.out.println("you entered wrong username to continue again");
		}
		if(pass==false) {
			System.out.println("please entered a valid password to continue again");
		}
		if(mob==false) {
			System.out.println("Enter a valid mobile of 10 digit to continue again");
		}
		if(emai==false) {
			System.out.println("enter a valid email to continue again");
		}
		}
	}

}
