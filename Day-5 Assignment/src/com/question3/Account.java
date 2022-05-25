package com.question3;

public class Account {
	
	private int accountId; 
	private String accountType;
	private int balance; 
	
	public void setAccountId(int accountId) {
		this.accountId=accountId;
	}
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public boolean withdraw(int withDrawl) {
		if(getBalance()>0  && getBalance() > withDrawl) {
			int currentBal=getBalance()-withDrawl;
			System.out.println("Balance amount after withdraw:"+currentBal);
			return true;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
}

