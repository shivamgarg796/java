package com.masai.test;

import java.util.Set;

import javax.persistence.EntityManager;

import com.masai.entity.Address;
import com.masai.entity.Employee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
//		Address adr1=new Address("AP","Vizag","4334334","office");
//		Address adr2=new Address("Maharashtra","pune","6334334","home");
//		
//		Employee emp=new Employee();
//		emp.setName("Ram");
//		emp.setGender("Male");
//		emp.setSalary(7800);
//		emp.setHomeAddr(new Address("Maharastra", "pune", "754554"));
//		emp.setOfficeAddr(new Address("Telengana","hydrabad", "785422"));
		
//		Set<Address> addresses=emp.getAddresses();
//		addresses.add(officeadr);
//		addresses.add(homeadr);
//		
//		emp.getAddresses().add(adr1);
//		emp.getAddresses().add(adr2);
		
		
//		Address adr1=new Address("UP","KANPUR","1524334","office");
//		Address adr2=new Address("UP","Amethi","2534334","home");
//		
//		Employee emp=new Employee();
//		emp.setName("manish");
//		emp.setGender("Male");
//		emp.setSalary(7100);
//		
//		emp.getAddresses().add(adr1);
//		emp.getAddresses().add(adr2);
		
		Address adr1=new Address("MP","Gwalior","0124334","office");
		Address adr2=new Address("MH","pune","8585334","home");
		
		Employee emp=new Employee();
		emp.setName("deepak");
		emp.setGender("Male");
		emp.setSalary(1500);
		
		emp.getAddresses().add(adr1);
		emp.getAddresses().add(adr2);
//		
//		Address adr1=new Address("West Bengal","mooni","4334334","office");
//		Address adr2=new Address("kerala","cilyi","4545334","home");
//		
//		Employee emp=new Employee();
//		emp.setName("Rashmi");
//		emp.setGender("female");
//		emp.setSalary(12800);
//		
//		emp.getAddresses().add(adr1);
//		emp.getAddresses().add(adr2);
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();
		
	}

}
