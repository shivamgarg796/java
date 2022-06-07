package com.question1;

public class Account {

	 String accountNumber;
	 double balance;
	 
	 public Account(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	 
	 

	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	void deposit(int amount){
		balance=balance+amount;
		setBalance(balance);
	 }
	 
	 double withdraw(int amount) {
		balance=balance-amount;
		setBalance(balance);
		return balance;
	 }
}
