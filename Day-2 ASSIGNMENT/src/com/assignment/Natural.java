package com.assignment;

public class Natural {
	
	static int sum;
	
	static int naturalNumber(int n) {
		
		sum = n*(n+1)/2;
		return sum;
	
	}
	

	public static void main(String[] args) {
		int result=naturalNumber(5);
		System.out.println(result);

	}

}
