package com.question4;
import java.util.Scanner;
public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("How many Student objects need to be created");
		System.out.println();
		int stu=sc.nextInt();
		
		Student[] studentObjects = new Student[stu];
		
		for(int i=0;i<studentObjects.length;i++) {
			    System.out.println("Enter Student " + (i + 1)+" "+"Details :");
	            
			    System.out.println("Enter Roll NO :");
	            int roll=sc.nextInt();
	            
	            System.out.println("Enter Name :");
	            String name = sc.next();
	            
	            System.out.println("Enter Address :");
	            String address = sc.next();

	            System.out.println("Enter Marks :");
	            int marks=sc.nextInt();
	            
	            studentObjects[i] = new Student();
	            studentObjects[i].setRoll(roll);
	            studentObjects[i].setName(name);
	            studentObjects[i].setAddress(address);
	            studentObjects[i].setMarks(marks);
	        }
		
		
		for(int i=0;i<studentObjects.length;i++) {
		    System.out.println("Enter Student " + (i + 1)+" "+"Details");
       
		    System.out.println(studentObjects[i].getRoll());
		    System.out.println(studentObjects[i].getName());
		    System.out.println(studentObjects[i].getAddress());
		    System.out.println(studentObjects[i].getMarks());
		    System.out.println();
        }
		
		
			
		
		
	}

}
