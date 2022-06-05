package com.question2;
import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of the student");
		System.out.println("Press 1 to enter details of History student and Press 2 for enter details of Science student");
		int stu=sc.nextInt();
		
		if(stu==1) {
			System.out.println("Enter the name :");
			String name=sc.next();
			
			System.out.println("Enter Address :");
			String address=sc.next();
			
			System.out.println("Enter the marks of history :");
			int his=sc.nextInt();
			
			System.out.println("Enter the marks of civics :");
			int civ=sc.nextInt();
			
			HistoryStudent hs=new HistoryStudent(name,address,his,civ);
			float res=hs.getPercentage();
			System.out.println("The percentage of student is :"+res+"%");
		}
		else if(stu==2){
			System.out.println("Enter the name :");
			String name=sc.next();
			
			System.out.println("Enter Address :");
			String address=sc.next();
			
			System.out.println("Enter the marks of Physics :");
			int phy=sc.nextInt();
			
			System.out.println("Enter the marks of Chemistry :");
			int chem=sc.nextInt();
			
			System.out.println("Enter the marks of Maths :");
			int math=sc.nextInt();
			
			ScienceStudent ss=new ScienceStudent(name, address,phy, chem, math );
			float res=ss.getPercentage();
			
			System.out.println("The percentage of student is :"+res+"%");
		}
		else
			System.out.println("Invalid choice");

	}

}
