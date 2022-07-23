package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EmployeeDao dao = new EmployeeDaoImpl();

		System.out.println("Enter eId of Employee");
		int eId = sc.nextInt();

		try {
			Employee e1 = dao.getSalaryByEmployeeById(eId);

		} catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
		}

		try {
			List<Employee> employees = dao.getAllEmployees();

			employees.forEach(s -> {
				System.out.println("Eid is :" + s.getEmpId());
				System.out.println("Name is :" + s.getName());
				System.out.println("Address is :" + s.getAddress());
				System.out.println("Salary is :" + s.getSalary());

				System.out.println("===========================");
			});

		} catch (EmployeeException ee) {
			ee.printStackTrace();
			System.out.println(ee.getMessage());
		}

		System.out.println("Enter Bonus of Employee");
		int bonus = sc.nextInt();
		try {
			boolean b = dao.provideBonus(bonus);
			if (b)
				System.out.println("Bonus added...");
			else
				System.out.println("Bonus not added...");

		} catch (EmployeeException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		System.out.println("Enter eId of Employee");
		int eId1 = sc.nextInt();

		System.out.println("Enter name of Employee");
		String name = sc.next();

		System.out.println("Enter salary of Employee");
		int salary = sc.nextInt();

		Employee e = new Employee(eId1, name, salary);

		String msg = dao.insertEmployeeDetails(e);

		System.out.println(msg);

		System.out.println("Enter the Id :");
		int id = sc.nextInt();

		try {
			Employee e1 = dao.searchEmployeeById(id);

			System.out.println("EmpId IS :" + e1.getEmpId());
			System.out.println("Name is :" + e1.getName());
			System.out.println("Address is :" + e1.getAddress());
			System.out.println("Salary is :" + e1.getSalary());
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}

		System.out.println("Enter the salary :");
		int sal = sc.nextInt();

		try {
			List<Employee> employees = dao.getAllEmployeesBySalary(sal);

			employees.forEach(s -> {
				System.out.println("Eid is :" + s.getEmpId());
				System.out.println("Name is :" + s.getName());
				System.out.println("Address is :" + s.getAddress());
				System.out.println("Salary is :" + s.getSalary());

				System.out.println("===========================");
			});

		} catch (EmployeeException ee) {
			ee.printStackTrace();
			System.out.println(ee.getMessage());
		}

	}
}
