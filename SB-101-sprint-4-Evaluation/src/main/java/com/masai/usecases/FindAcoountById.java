package com.masai.usecases;

import org.jboss.jandex.Main;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.exception.InvalidAccount;

public class FindAcoountById {

	public static void main(String[] args) {
		
		AccountDao ad=new AccountDaoImpl();
		
		try {
			ad.findById(1);
		} catch (InvalidAccount e) {
			System.out.println(e.getMessage());
		}
	}
}
