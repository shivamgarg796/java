package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("account-unit1");
	}
	
	public static EntityManager provideEntityManager() {
		EntityManager em= emf.createEntityManager();
		return em;
//		return emf.createEntityManager();
	}
}
