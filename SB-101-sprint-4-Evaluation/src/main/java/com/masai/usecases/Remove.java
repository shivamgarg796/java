package com.masai.usecases;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entity.Account;
import com.masai.exception.InvalidAccount;


public class Remove {

	public static void main(String[] args) {
		
		AccountDao ed=new AccountDaoImpl();
		
		Account a=new Account(1,"sharma","patna",456.85);
		try {
			ed.remove(a);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
