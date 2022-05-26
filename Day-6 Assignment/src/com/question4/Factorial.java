package com.question4;

public class Factorial {
		
	
	public static int factorial(int n) {
		int flag=1;
		for(int i=1;i<=n;i++) {
		flag=flag*i;
		}
		return flag;
	}
	public static void main(String[] args) {
		
		if(args.length>2) {
			System.out.println("Error");
		}
		else if(args.length==2) {
		int a	=Integer.parseInt(args[0]);
		int b   =Integer.parseInt(args[1]);
		int value=Math.abs(a-b);
		System.out.println(factorial(value)); 
		}
		else {
			System.out.println(factorial(Integer.parseInt(args[0])));
		}
		
	}
}
