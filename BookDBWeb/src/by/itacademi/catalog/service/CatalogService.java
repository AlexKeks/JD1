package by.itacademi.catalog.service;

import by.itacademi.catalog.domain.entyty.Book;
import by.itacademi.catalog.domain.vo.Catalog;

public interface CatalogService {
	
	Catalog getCatalog();
	
	Book getBook(int id);

	Book addBook();

	void addBook(Book book);
	
	void removeBook(int[] bookId);
}
