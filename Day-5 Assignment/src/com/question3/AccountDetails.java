package com.question3;

import java.util.Scanner;
public class AccountDetails {
	
	public Account getAccountDetails(int accountId,String accountType,int balance) {
		Account ac=new Account();
		
		ac.setAccountId(accountId);
		ac.setAccountType(accountType);
		if(balance<=0) {
		System.out.println("Balance should be positive");
		}
		else {
			ac.setBalance(balance);
		}
		return ac;
	}
	
	public int getWithdrawAmount(int balanceWithdrawn){
		if(balanceWithdrawn<=0) {
		System.out.println("Balance should be positive");
		}
		return balanceWithdrawn;
		
		
	}

	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    
	    AccountDetails ad=new AccountDetails();

	    
		System.out.println("Enter account id:");
		int acId=sc.nextInt();
		
		System.out.println("Enter account type:");
		String aType=sc.next();
		
	    
		System.out.println("Enter balance :");
		int bal=sc.nextInt();
		
		Account ac1=ad.getAccountDetails(acId,aType,bal);
		
		System.out.println("Enter amount to be withdrawn:");
		int balWith=sc.nextInt();
		ad.getWithdrawAmount(balWith);
		
		ac1.withdraw(balWith);
		
		}

}
