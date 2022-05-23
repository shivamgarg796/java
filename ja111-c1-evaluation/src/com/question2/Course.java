//Question 2 
package com.question2;
import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println("courseId :"+courseId);
		System.out.println("courseName"+ courseName);
		System.out.println("courseFee"+courseFee);
	}
	
	static void authenticate(String username,String password) {
		if(username.equals("Admin")&& password.equals("1234")) {
			Course c=new Course();
			c.courseId=101;
			c.courseName="Full Stack Web Developer";
			c.courseFee=50000;
			c.displayCourseDetails();
	      }
		else
		System.out.println("Invalid Username or password");
     }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String val=sc.nextLine();
		System.out.println("Enter password");
		String pas=sc.nextLine();
		authenticate(val,pas);
	}
}