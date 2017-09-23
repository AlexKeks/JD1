package by.htp.bookStore.dao;

import java.util.List;

import by.htp.bookStore.domain.entyty.Book;

public interface BookDao {
	
	List<Book> readBooks();
	
	Book readBook(int id) throws DaoException;

	void deleteBook(int id); 
	
	void addBook(Book book) throws DaoException;
	
	void updateBook (Book book, String title);
}
