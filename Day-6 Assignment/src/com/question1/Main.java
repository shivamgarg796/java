package com.question1;

import java.util.Scanner;
	
	class Main{
	
		public static String reversString(String input){
			int n=input.length();
		  char []chars =new char[n]; 
	         
	        for (int i = n- 1; i >= 0; i--) {
	            chars[n-i-1]=input.charAt(i);
	        }
	        return new String(chars);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Enter a String to reverse");
		
		String originalString = sc.next();
	
	
		String result = reversString(originalString);
	
	
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
	}
	}
