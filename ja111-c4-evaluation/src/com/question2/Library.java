package com.question2;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	 void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added successfully");
	}
	
	
     boolean isEmpty() {
        if(bookList.isEmpty())
		return true;
    	else
		return false;
	}
			
			
      List<Book> viewAllBooks(){
		return bookList;
      }
	
	
	 List<Book> viewBooksByAuthor(String author ) {
		 List<Book> listOfBooks=new ArrayList<>();
		 if(listOfBooks.isEmpty()) {
			 System.out.println("The list is empty");
		 }
		 else if(!listOfBooks.isEmpty()){
	        for(Book b: bookList){
	            if(b.getAuthor().equals(author)){
	                listOfBooks.add(b);
	            }
	        }
		 }
		return listOfBooks;
	 }
	
	 int countNoOfBook(String bookName) { 
		  int count=0;
	        for (Book b: bookList){
	            if(b.getBookName().equals(bookName)){
	                count++;
	            }
	        }
	        return count;
	        }
}
