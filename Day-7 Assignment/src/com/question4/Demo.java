package com.question4;
import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
			AxisBank a1=new AxisBank();
			a1.branchName="Shahganj";
			a1.ifscCode="AXIS12345";
			a1.rateOfInterest=2.5;
			
			return a1;
		}
		
		else if(bank.equals("icici")) {
			ICICIBank i1=new ICICIBank();
			i1.branchName="RamNagar";
			i1.ifscCode="ICICI12345";
			i1.rateOfInterest=3.5;
			return i1;
		}
		else {
			System.out.println("null");
			return null;
		}
	}

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Bank");
		String name=sc.next();
		Bank b1=getBank(name);
		b1.displayDetails();
		
		if(b1 instanceof AxisBank) {
			AxisBank a2 = (AxisBank)b1;
			a2.getCreditCard();
		}
			
		
		
		

	}

}
