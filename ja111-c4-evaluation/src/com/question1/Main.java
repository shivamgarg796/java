package com.question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public void getAge() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Date of Birth :");
		
		try {
		String date=sc.next();
		
		DateTimeFormatter formatObj= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate dt=LocalDate.parse(date, formatObj);
		
		LocalDate now=LocalDate.now();
		
		Period period =Period.between(dt, now);
		
		int pe=period.getYears();
		
		if(pe <= 0) {
			System.out.println("Date of birth should not be in future");
		}
		else if(pe>=18) {
			System.out.println("You are eligible to cast your vote");
		}
		else if(date.equals(now));
		{
			System.out.println("Happy Birthday, You are eligible to cast your vote.");
		}
	}
		catch(Exception e) {
			System.out.println("please pass the date in the proper format");
		}
		
		
}
		public static void main(String []args) {
			Main m=new Main();
			m.getAge();
		}
	
}
