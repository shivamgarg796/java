package com.masai.dao;

import com.masai.entity.Account;
import com.masai.exception.InsufficientBalance;
import com.masai.exception.InvalidAccount;

public interface AccountDao {

	void save(Account account);
	
	Account findById(int id) throws InvalidAccount;
	
	void update(Account account) throws InvalidAccount;
	
	void remove(Account account) throws InvalidAccount;
	
	int withdraw(double amount, Account account) throws InsufficientBalance;
	
	String deposit(double amount, Account account) throws InvalidAccount;
}
