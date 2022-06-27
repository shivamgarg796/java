package com.question1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

        int getAge()throws InvalidDateFormat {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of Birth : ");
		
		try {
			String date = sc.next();
			
			DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate dt = LocalDate.parse(date, formatObj);
			LocalDate now = LocalDate.now();
			
			Period period  = Period.between(dt, now);
			
			int pe = period.getYears();
			
			if(pe <= 0) {
				throw new InvalidDateFormat("Date Should Not be in Future");
			}
			return pe;
			
		}catch(DateTimeParseException dtpe) {
			throw new InvalidDateFormat("Invalid input please Enter the date in dd-MM-yyyy format");
		}
	}
	
	public static void main(String[] args) {

		Main m1 = new Main();
		
		try {
			System.out.println(m1.getAge());
			
		}catch(InvalidDateFormat idf) {
			
			System.out.println(idf.getMessage());
			
		}
	}
	
}
