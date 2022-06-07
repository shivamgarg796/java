package com.question2;
import java.util.Scanner;
public class UserRegistration {

	void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		} else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		UserRegistration ur=new UserRegistration();
		System.out.println("Enter Your Name:");
		String name=sc.next();
		
		System.out.println("Enter Your Country:");
		String country=sc.next();
		
		try {
			ur.registerUser(name,country);
		
		} catch (InvalidCountryException e) {
			
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

}
