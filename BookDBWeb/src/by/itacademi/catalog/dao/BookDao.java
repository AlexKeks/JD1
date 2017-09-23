package by.itacademi.catalog.dao;

import java.util.List;

import by.itacademi.catalog.domain.entyty.Book;

public interface BookDao {
	
	List<Book> readBooks();

	Book readBook(int id);
	
	void addBookDao(Book book);

	void deleteBook(int[] bookId);

}
