package by.itacademi.catalog.service.impl;

import by.itacademi.catalog.dao.BookDao;
import by.itacademi.catalog.dao.impl.BookDaoImpl;
import by.itacademi.catalog.domain.entyty.Book;
import by.itacademi.catalog.domain.vo.Catalog;
import by.itacademi.catalog.service.CatalogService;

public class SimpleCatalogImpl implements CatalogService{

	private BookDao dao;
	
	{
		dao = new BookDaoImpl();
	}
	
	@Override
	public Catalog getCatalog() {
		
		Catalog catalog = new Catalog();
		catalog.setTitle("New Catalog");
		catalog.setBooks(dao.readBooks());
		return catalog;
	}

	@Override
	public Book getBook(int id) {
		
		Book book = dao.readBook(id);
		return book;
	}

	@Override
	public void addBook(Book book) {
		dao.addBookDao(book);
		
	}

	@Override
	public Book addBook() {
		
		return null;
	}

	@Override
	public void removeBook(int[] bookId) {
		dao.deleteBook(bookId);
		
	}

}
