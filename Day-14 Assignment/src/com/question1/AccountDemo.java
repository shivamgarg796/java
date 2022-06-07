package com.question1;
import java.util.Scanner;
public class AccountDemo {

	public static void main(String[] args) throws InsufficientFundsException {
		System.out.println("Start of main");
		Scanner sc =new Scanner(System.in);
		Account a1=new Account("0193108025058");
		
		System.out.println("Enter amount to be deposit ");
		int deposit=sc.nextInt();
		a1.deposit(deposit);
		
		System.out.println("=========================");
		
		System.out.println("After deposit the current balance is"+a1.getBalance());
		
		System.out.println("=========================");
		System.out.println("Enter amount to withdraw ");
		
		int withdraw=sc.nextInt();
		
		try {
			if(withdraw > a1.getBalance()) {
			InsufficientFundsException ife=new InsufficientFundsException();
			throw ife;
			}
			else {
				a1.withdraw(withdraw);
			}
		
			System.out.println("=========================");
		
			System.out.println("After withdraw the current balance is"+a1.getBalance());
		}
		catch(InsufficientFundsException ife) {
			System.out.println("Insufficient Balance");
		}
			
			System.out.println("End oF main");
		
		

	}

}
