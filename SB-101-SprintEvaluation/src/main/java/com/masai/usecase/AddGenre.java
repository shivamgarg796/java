package com.masai.usecase;

import java.util.Date;

import com.masai.dao.LibraryDao;
import com.masai.dao.LibraryDaoImpl;
import com.masai.entity.Book;
import com.masai.entity.Book_Genre;

public class AddGenre {

	public static void main(String[] args) {
		LibraryDao ld =new LibraryDaoImpl();
		Book_Genre b1=new Book_Genre();
		
		b1.setGenre_name("xyz");
		boolean b=ld.addGenre(b1);
		System.out.println(b);
	}
}
