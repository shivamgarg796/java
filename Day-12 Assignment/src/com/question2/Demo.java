package com.question2;

import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

public class Demo {
	
	public static boolean checkName(String name) {
		boolean res=Pattern.matches("[A-Za-z]{3,8}", name);
		return res;
	}
	
	public static boolean checkAdhaar(String adhaar) {
		boolean res=Pattern.matches("[2-9][0-9]{11}",adhaar);
		return res;
	}
	
	public static boolean checkMobile(String mobile) {
		boolean res=Pattern.matches("[6789]{1}[0-9]{9}",mobile);
		return res;
	}
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the NAME of min length 3 and max length 8 alphabets only");
		String name=sc.next();
		boolean nam=Demo.checkName(name);

		
		System.out.println("Enter the Adhaar number of 12 digit only");
		String adhaar=sc.next();
		boolean adar=Demo.checkAdhaar(adhaar);
		
		System.out.println("Enter the MOBILE of 10 digits number");
		String mobile=sc.next();
		boolean mob=Demo.checkMobile(mobile);
		
		
//		System.out.println(adar);
		
		if(nam==true &&  mob == true && adar==true) {
			
		Citizen c1=new Citizen();
		c1.setName(name);
		c1.setAadharNumber(adhaar);
		c1.setMobileNumber(mobile);
		
		System.out.println("Information saved succesfully");
		
		System.out.println("Name is :"+c1.getName());
		System.out.println("Adhaar is :"+c1.getAadharNumber());
		System.out.println("Mobile is :"+c1.getMobileNumber());
		}
		else {
			
		if(nam==false) {
			System.out.println("you entered wrong name");
		}
		if(adar==false) {
			System.out.println("please entered a valid Adhhar to continue again");
		}
		if(mob==false) {
			System.out.println("Enter a valid mobile of 10 digit to continue again");
		}
		}
	}

}

