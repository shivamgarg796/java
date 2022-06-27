package com.question2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class EmployeeBonus {

	static int getAge(String join) throws InvalidAgeException{
		
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate doj = LocalDate.parse(join, format);
			
			LocalDate ld = LocalDate.now();
			
			Period period = Period.between(doj, ld);
			
			int y = period.getYears();
			
			int m = period.getMonths();
			
			int d = period.getDays();
			
			if(y != 0 && y > 0) {
				return y;
				
			}else if(m > 0) {
				return m/10;
				
			}else if(d > 0) {
				return d/10;
				
			}else {
				
				throw new InvalidAgeException("Age should not be in the future .");
			}
		
		}catch(DateTimeParseException dtpe) {
			
			throw new InvalidAgeException("Please pass the date in the correct format");
		}
	}
	
	static void getBonus(int year) {
		int salary;
		if(year <= 1) {
			salary = 5000;
		}else if(year >1 && year <=2) {
			salary = 8000;
		}else {
			salary = 10000;
		}
		System.out.println("The Bonus for the Employee is : "+salary);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of joining in dd-MM-yyyy format : ");
		String date = sc.next();
		
		try {
			int workT = getAge(date);
			getBonus(workT);
		}catch(InvalidAgeException iae) {
			System.out.println(iae.getMessage());
		}
		
	}

}
