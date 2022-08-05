	package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entity.Department;
import com.masai.entity.Employee;
import com.masai.utility.EMUtil;


public class Main {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		
		Employee emp1=new Employee();
		emp1.setEname("Anil");
		emp1.setSalary(8200);
		emp1.setAddress("Agra");
		
		Employee emp2=new Employee();
		emp2.setEname("suresh");
		emp2.setSalary(6500);
		emp2.setAddress("Surat");
		
		Employee emp3=new Employee();
		emp3.setEname("Rani");
		emp3.setSalary(3000);
		emp3.setAddress("cochin");
		
		Department dept=new Department();
		
		dept.setDname("SALES");
		dept.setLocation("Delhi");
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(dept);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done...");
		

		
	}
}
