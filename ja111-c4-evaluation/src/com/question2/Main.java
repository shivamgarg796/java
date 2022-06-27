package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Library l1=new Library();
		
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Count number of books - by book name");
		System.out.println("5.Exit");
		
		System.out.println("ENTER YOUR CHOICE :");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("Enter the isbn no :");
			int isbn=sc.nextInt();
			
			System.out.println("Enter the Book name :");
			String bname=sc.next();
			
			System.out.println("Enter the author name :");
			String aname=sc.next();
			
			l1.addBook(new Book(isbn, bname, aname));
			
			}
		else if(choice==2) {
			l1.viewAllBooks();
			}
	
	    else if(choice==3) {
	    	System.out.println("Enter the Book Name");
	    	String auth=sc.next();
	    	System.out.println(l1.viewBooksByAuthor(auth));
	    }
	    else if(choice==4) {
	    	  System.out.println("Enter the book Name");
              String name=sc.next();
              System.out.println("Count of books => "+l1.countNoOfBook(name));
	    }
	    else if(choice==5){
	    	System.out.println("Thank You!");
	    	System.exit(0);
	    }

}
}
