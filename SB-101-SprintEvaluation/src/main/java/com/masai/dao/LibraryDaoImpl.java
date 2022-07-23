package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.entity.Book;
import com.masai.entity.Book_Genre;
import com.masai.exception.BookNotFound;
import com.masai.exception.GenreNotFound;
import com.masai.utility.EMUtil;

public class LibraryDaoImpl implements LibraryDao {

	@Override
	public boolean addBook(Book book) {
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(book);
		
		em.getTransaction().commit();
		
		em.close();
		
		return true;
	}

	@Override
	public boolean addGenre(Book_Genre bookGenre) {
       EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(bookGenre);
		
		em.getTransaction().commit();
		
		em.close();
		
		return true;
	}

	@Override
	public List<Book> getBooksByGenre(String genre) throws GenreNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAuthorName(String bookName, String authorName) throws BookNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGenre(String genre) throws GenreNotFound {
       EntityManager em=EMUtil.provideEntityManager();
       Book_Genre b1= em.find(Book_Genre.class, genre);
       
		em.getTransaction().begin();
		
		em.remove(genre);
		
		em.getTransaction().commit();
		
		em.close();
		
		
	}

	@Override
	public void removeBook(String bookName) throws BookNotFound {
        EntityManager em=EMUtil.provideEntityManager();
        
        Book b1= em.find(Book.class, bookName);
		
        if(b1!=null) {
		em.getTransaction().begin();
		
		em.remove(b1);
		
		em.getTransaction().commit();
		
		em.close();
        }
        else
        	System.out.println("No book found with this name...");
		
		
	}

}
