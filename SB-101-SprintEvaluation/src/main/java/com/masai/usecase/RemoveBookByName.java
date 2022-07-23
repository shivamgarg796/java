package com.masai.usecase;

import com.masai.dao.LibraryDao;
import com.masai.dao.LibraryDaoImpl;
import com.masai.exception.BookNotFound;

public class RemoveBookByName {

	public static void main(String[] args) {
		
		LibraryDao ld =new LibraryDaoImpl();
		try {
			ld.removeBook("physics");
		} catch (BookNotFound e) {
			e.printStackTrace();
		}
	}
}
