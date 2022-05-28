package com.question2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Hosteller h1=new Hosteller(101, "nrupul", 2500.00, 10000.00);
      	Hosteller h2=new Hosteller(102, "yogesh", 2500.00, 10000.00);
	
		
		DayScholar d1=new DayScholar(101, "abhishek", 2500.00, 7000.00);
		DayScholar d2=new DayScholar(101, "shivam", 2500.00, 7000.00);
	
		h1.displayDetails3();
		
		h2.displayDetails3();
		
		d1.displayDetails2();
		
		d2.displayDetails2();

	}

}
