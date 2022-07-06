package com.question3;

public class Account {

	int balance;
	int accountNo;



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}



	void displayBalance(){
		System.out.println(getBalance());
	}
	
	
	
	void deposit(int amount){
	int bal=getBalance()+amount;
	System.out.println(amount+"="+"Is DEposited");
	setBalance(bal);
	displayBalance();
	}
	
	
	
	void withdraw(int amount){
		int bal=getBalance()-amount;
		System.out.println(amount+"="+"Is Withdrawl");
		setBalance(bal);
		displayBalance();
	}



	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNo=" + accountNo + "]";
	}
	
	
}
