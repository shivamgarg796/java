package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entity.Account;
import com.masai.exception.InsufficientBalance;
import com.masai.exception.InvalidAccount;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao  {

	@Override
	public void save(Account account) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		System.out.println(em);
		
		em.getTransaction().begin();
		
		em.persist(account);
		
		em.getTransaction().commit();
		
		em.close();
		
		
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		Account account=null;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		account=em.find(Account.class, id);
		
		return account;
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		
		EntityManager em=EMUtil.provideEntityManager();
		
        em.getTransaction().begin();
		
		em.merge(account);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public void remove(Account account) throws InvalidAccount {
      
		EntityManager em= EMUtil.provideEntityManager();
		
		Account acc=em.find(Account.class, account);
		
		if(acc != null){
			
			em.getTransaction().begin();
			
			em.remove(acc);
			
			em.getTransaction().commit();
		}
		
		em.close();
		
	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		// TODO Auto-generated method stub
		return null;
	}
	

}
