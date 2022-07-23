package com.masai.usecase;

import java.util.Date;

import com.masai.dao.LibraryDao;
import com.masai.dao.LibraryDaoImpl;
import com.masai.entity.Book;

public class AddBook {

	public static void main(String[] args) {
		LibraryDao ld =new LibraryDaoImpl();
		Book b1=new Book();
		
		b1.setBook_name("physics");
		b1.setAuthor_name("s.chand");
		b1.setPublished_date(new Date(2000, 11, 21));
		boolean b=ld.addBook(b1);
		System.out.println(b);
		
	}
}
