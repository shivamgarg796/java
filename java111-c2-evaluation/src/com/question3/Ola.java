package com.question3;

public class Ola extends Car {

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h1=new HatchBack();
			h1.setNumberofPassenger(numberOfPassenger);
			h1.getNumberOfKms(numberOfKMs);
			h1.getFare();
			System.out.println(h1.getFare());
			return h1;
		}
		else {
			Sedan s1=new Sedan();
			s1.setNumberofPassenger(numberOfPassenger);
			s1.setNumberOfKms(numberOfKMs);
			s1.getFare();
			System.out.println(s1.getFare());
			return s1;
		}
	}

	public int calculateBill(Car car) {
		if(car instanceof Sedan) {
			int totalfare=((Sedan) car).getFare()*car.getNumberOfPassenger(); 
			return totalfare;
		}
		else {
			int totalfare=((HatchBack) car).getFare()*car.getNumberOfPassenger();
			return totalfare;
		}
	}
}
