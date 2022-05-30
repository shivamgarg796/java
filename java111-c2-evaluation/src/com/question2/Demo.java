package com.question2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many students objects to be created :");
		int num=sc.nextInt();
		
		Student[] std=new Student[num];
		for(int i=0;i<std.length;i++) {
			System.out.println("Enter the roll number");
			int rol=sc.nextInt();
			std[i].setRoll(rol);
			
			System.out.println("Enter the name");
			String nam=sc.next();
			std[i].setName(nam);
			
			System.out.println("Enter the address");
			String addres=sc.next();
			std[i].setAddress(addres);
			
			System.out.println("Enter the roll number");
			int mark=sc.nextInt();
			std[i].setMarks(mark);
			
			std[i].printDetail();
		}
		
	
	}

}
