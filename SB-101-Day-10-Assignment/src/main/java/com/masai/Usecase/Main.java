package com.masai.Usecase;

import com.masai.Entity.Address;
import com.masai.Entity.Employee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em=EMUtil.provideEntityManager();
        Employee emp1 =new Employee();
        Address adr1a=new Address("AP","Vizag","4334334");
		Address adr1b=new Address("Maharashtra","pune","6334334");
        emp1.setName("Ram");
        emp1.setSalary(7600);
        emp1.setHomeAddress(adr1a);
        emp1.setOfficeAddress(adr1b);

        Employee emp2 =new Employee();
        Address adr2a=new Address("UP","KANPUR","1524334");
		Address adr2b=new Address("UP","Amethi","2534334");
        emp2.setName("Manish");
        emp2.setSalary(8600);
        emp2.setHomeAddress(adr2a);
        emp2.setOfficeAddress(adr2b);

        Address adr3a=new Address("MP","Gwalior","0124334");
		Address adr3b=new Address("MH","pune","8585334");

		Employee emp3=new Employee();
		emp3.setName("deepak");
		emp3.setSalary(1500);
        emp3.setHomeAddress(adr3a);
        emp3.setOfficeAddress(adr3b);


        Address adr4a=new Address("West Bengal","mooni","4334334");
		Address adr4b=new Address("kerala","cilyi","4545334");
		Employee emp4=new Employee();
		emp4.setName("Rashmi");
		emp4.setSalary(12800);
        emp4.setHomeAddress(adr4a);
        emp4.setOfficeAddress(adr4b);
        em.getTransaction().begin();

        em.persist(emp1);
        em.persist(emp2);
        em.persist(emp3);
        em.persist(emp4);

        em.getTransaction().commit();

        System.out.println("done...");

        em.close();
    }
}
