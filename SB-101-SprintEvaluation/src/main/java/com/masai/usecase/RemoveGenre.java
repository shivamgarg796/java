package com.masai.usecase;

import com.masai.dao.LibraryDao;
import com.masai.dao.LibraryDaoImpl;
import com.masai.exception.GenreNotFound;

public class RemoveGenre {

	public static void main(String[] args) {
		
		LibraryDao ld =new LibraryDaoImpl();
		try {
			ld.removeGenre("xyz");
		} catch (GenreNotFound e) {
			e.printStackTrace();
		}
		
	}
}
