package by.htp.bookStore.dao.impl;

import java.util.ArrayList;
import java.util.List;

//import com.mysql.cj.jdbc.exceptions.OperationNotSupportedException;

import by.htp.bookStore.dao.BookDao;
import by.htp.bookStore.domain.entyty.Book;

public class BookFileImpl implements BookDao {

	@Override
	public List<Book> readBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book(1, "Book1", 10));
		books.add(new Book(2, "Book1", 15));
		books.add(new Book(3, "Book1", 20));

		return books;

	}

	@Override
	public Book readBook(int id) {
		return null;
	//	throw new OperationNotSupportedException();
	}

	@Override
	public void deleteBook(int id) {
		

	}

	@Override
	public void addBook(Book book) {
		

	}

	@Override
	public void updateBook(Book book, String title) {
		
		

	}

}
