package com.question3;

public class Ola{

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h1=new HatchBack();
			h1.setNumberofPassenger(numberOfPassenger);
			h1.setNumberOfKms(numberOfKMs);
			h1.getFare();
			return h1;
		}
		else {
			Sedan s1=new Sedan();
			s1.setNumberofPassenger(numberOfPassenger);
			s1.setNumberOfKms(numberOfKMs);
			s1.getFare();
			return s1;
		}
	}

	public int calculateBill(Car car) {
		if(car instanceof Sedan) {
			int totalfare=((Sedan) car).getFare()* car.getNumberOfKms(); 
			return totalfare;
		}
		else {
			int totalfare=((HatchBack)car).getFare()* car.getNumberOfKms();
			return totalfare;
		}
	}
}
