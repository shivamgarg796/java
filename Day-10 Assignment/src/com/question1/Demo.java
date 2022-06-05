package com.question1;
import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {

		if(amount > 1000)
			return new TajHotel();
		else if(amount > 200 && amount <= 1000)
			return new RoadSideHotel();
		else
			return null;
		}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Valid Amount");
		int amt=s.nextInt();
			Demo d1=new Demo();
		    Hotel hotel=d1.provideFood(amt);
		    if(hotel!=null) {
		    hotel.chickenBiryani();
		    hotel.masalaDosa();
		    if(hotel instanceof TajHotel) {
		    	TajHotel taj=(TajHotel)hotel;
		    	taj.welcomeDrink();
		    }
		    }
		    else
		    	System.out.println("Amount should be greater than 200");
		}
}
