package by.htp.bookStore.service;

import by.htp.bookStore.domain.entyty.Book;
import by.htp.bookStore.domain.vo.Catalog;

public interface BookService {

	Catalog getBookCatalog();
	
	void addNewBook(Book book);
	
	Book getBook(int id);
	
	void deleteBook(int id); 
	
	void updateBook(Book book, String title);
	
}
