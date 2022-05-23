//Question 1
package com.evaluationc1;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Why String is immutable in java and what is the difference between String and String Builder?\r\n And Write some"
				+ "of the methods of String class at least 5 with example.");
		
		System.out.println("Answer:-String is immutable in java because when five reference variable is refer to one \n object,if one reference variable changes the value of the object it will be affected by all \n the reference variable.that's why String are mutable in java.");
	
		System.out.println("\n String is immutable. StringBuilder is mutable.\n String is slow as compare to StringBuilder. Stringbuilder is faster.\n Sring requires more memory. StringBuilder does not require more memory. ");
	
		System.out.println("\n length():-return the length of the string \n charAt(int i):-this method return the index. \n toUpperCase():-convert whole string into uppercase.\n toowerCase():-convert whole string into lowercase.\n concat():-Add two or more string.");
	}
}
