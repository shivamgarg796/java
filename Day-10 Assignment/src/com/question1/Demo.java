package com.question1;
import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if (amount>1000) {
			TajHotel t1=new TajHotel();
			t1.chickenBiryani();
			t1.masalaDosa();
			t1.welcomeDrink();
			return t1;
		}
		else{
			RoadSideHotel rsh=new RoadSideHotel();
			rsh.chickenBiryani();
			rsh.masalaDosa();
			return rsh;
		}
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Valid Amount");
		int amt=s.nextInt();
		
		if (amt<200)
			System.out.println("Please Enter a Valid Amount");
		else {
			Demo d1=new Demo();
		    d1.provideFood(amt);
		}
	}

}
