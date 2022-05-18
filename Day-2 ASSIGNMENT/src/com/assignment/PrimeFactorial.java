package com.assignment;

public class PrimeFactorial {

		static void number(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i == 0) 
			System.out.println(i);
		}
		}
		
		public static void main(String[] args) {

			
			 int number = 12;
			 if(number>2 && number <100)
				 number(number);
			 else
			 System.out.println("Invalid number");
		}
		
		
	}

