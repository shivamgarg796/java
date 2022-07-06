package com.question2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Address a1=new Address("Uttar Pradesh", "Agra", 282010);
		
		Employee e1=new Employee(101, "Shivam", a1, "shivamgarg796@gmail.com", "Shivam1454");
		
		FileOutputStream f;
		try {
			f = new FileOutputStream("emp.txt");
	
		ObjectOutputStream out=new ObjectOutputStream(f);
		
		out.writeObject(e1);
		out.flush();
		out.close();
		System.out.println("Done");
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found in the current directory");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
