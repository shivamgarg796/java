package com.question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		//Serialization 
		
		Address a1=new Address("Uttar Pradesh", "Agra", 282010);
		
		Student e1=new Student(101, "Shivam", a1, "shivamgarg796@gmail.com", "Shivam1454");
		
		FileOutputStream f;
		try {
			f = new FileOutputStream("student.txt");
	
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
		
		
		//Deserialization
		
		FileInputStream f1=null;
		try {
		 f1=new FileInputStream("student.txt");
			
			ObjectInputStream obj=new ObjectInputStream(f1);
			
			Object obj1=obj.readObject();
			
			Student s1=(Student)obj1;
			
			System.out.println(s1);
			
			obj.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
