package com.question4;

public class AxisBank extends Bank {

	double rateOfInterest;
	
	void displayDetails(){
		super.displayDetails();
		System.out.println("RateOfInterest :"+rateOfInterest);
		
	}
	
	void getCreditCard(){
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

