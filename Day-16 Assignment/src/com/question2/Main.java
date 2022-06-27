package com.question2;

import java.util.Scanner;
import java.util.TreeSet;

import com.question1.Product;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		TreeSet<Employee> lp=new TreeSet(new EmpSortBySalary());

		System.out.println("Enter the number of Employee you want to add :");
		int num=sc.nextInt();
		
		for(int i=0 ; i<num ;i++) {
			System.out.println("===========================================");
		System.out.println("Enter the details of"+" "+(i+1)+" "+"Employee");
		
		System.out.println("Enter the Employee Id :");
		int id=sc.nextInt();
		
		System.out.println("Enter the name of Employee :");
		String name=sc.next();
		
		System.out.println("Enter the salary of the employee");
		double price=sc.nextDouble();
		System.out.println("===========================================");
		
		Employee s1=new Employee(id, name, price);
		lp.add(s1);
		}
		
		for( Employee e1 :lp) {
			System.out.println(e1);
		}

	}

}
