package com.question2;

public class Loan {
	
	private Loan(){
		
	}

	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
//			System.out.println(employeeObj.getSalary());
			double loanAmt=0.15 * employeeObj.getSalary();
			return loanAmt;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
//			System.out.println(employeeObj.getSalary());
			double loanAmt=0.1 * employeeObj.getSalary();
			return loanAmt;
		}
		else {
			return 0.0;
		}
		
	
		
	}
	
	public static Loan getObj() {
		Loan l1=new Loan();
		return l1;
	}
}
