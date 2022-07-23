package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entity.Account;
import com.masai.utility.EMUtil;

public class SaveAccount {

	public static void main(String[] args) {
		
		AccountDao ad=new AccountDaoImpl();
		
		Account a1=new Account();
		a1.setId(1);
		a1.setEmail("shivam@gmail.com");
		a1.setAddress("agra");
		a1.setBalance(565.25);
		
		ad.save(a1);
		
		System.out.println("Account created...!");

	}

}
