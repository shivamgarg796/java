package com.question2;

public class Main {

	public static void main(String[] args) {
		
		Loan l2=Loan.getObj();
		
		PermanentEmployee pe =new PermanentEmployee(101, "Ratan", 10000.00);
		pe.calculateSalary();
		double loanAmt=l2.calculateLoanAmount(pe);
		
		
		
		TemporaryEmployee te =new TemporaryEmployee(102, "Shivam", 200, 30);
		te.calculateSalary();
		double loanAmt2=l2.calculateLoanAmount(te);
	
		
		double loanAmt3=l2.calculateLoanAmount(null);
		
		System.out.println("PERMANENT EMPLOYEE");
		System.out.println("ID is :"+pe.getEmployeeId());
		System.out.println("Name is :"+pe.getEmployeeName());
		System.out.println("Salary is :"+pe.getSalary());
		System.out.println("Loan Amount"+loanAmt);
		
		System.out.println("=================================");
		System.out.println("TEMPORARY EMPLOYEE");
		System.out.println("ID is :"+te.getEmployeeId());
		System.out.println("Name is :"+te.getEmployeeName());
		System.out.println("Salary is :"+te.getSalary());
		System.out.println("Loan Amount"+loanAmt2);
		
		System.out.println("=================================");
		System.out.println("IF YOU PASS NULL");
		System.out.println("Loan Amount"+loanAmt3);
		System.out.println("=================================");
	}

}
