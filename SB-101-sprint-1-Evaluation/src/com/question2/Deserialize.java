package com.question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {
		
		FileInputStream f1=null;
		try {
		 f1=new FileInputStream("emp.txt");
			
			ObjectInputStream obj=new ObjectInputStream(f1);
			
			Object obj1=obj.readObject();
			
			Employee e1=(Employee)obj1;
			
			System.out.println(e1);
			
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
