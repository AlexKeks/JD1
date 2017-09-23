package by.htp.bookStore.service.impl;

import java.util.Date;
import java.util.List;
import by.htp.bookStore.dao.BookDao;
import by.htp.bookStore.dao.DaoException;
import by.htp.bookStore.dao.impl.BookMySQLImpl;
import by.htp.bookStore.dao.impl.sax.BookSaxParser;
import by.htp.bookStore.domain.entyty.Book;
import by.htp.bookStore.domain.vo.Catalog;
import by.htp.bookStore.service.BookService;

public class BookServiceImpl implements BookService {

	// Change to factory!!!
	//private BookDao dao = new BookMySQLImpl();
	// private BookDao dao = new BookFileImpl();
	
	private BookDao dao = new BookSaxParser();
	//Change to private BookDao dao = new BookStaxParser();
	//Change to private BookDao dao = new BookDomParser();

	@Override
	public Catalog getBookCatalog() {

		List<Book> books = dao.readBooks();
		String catalogTitle = "Dayly catalog";
		Date dateCreation = new Date();

		Catalog catalog = new Catalog(catalogTitle, dateCreation);
		catalog.setBooks(books);

		return catalog;

	}
	
	@Override
	public Book getBook(int id) {
		Book book = null;
		if (id > 0) {
			try {
				book = dao.readBook(id);
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return book;
	}

	@Override
	public void addNewBook(Book book) {
		if (book != null) {
			try {
				dao.addBook(book);
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
	}



	@Override
	public void deleteBook(int id) {
		
		if (id > 0) {
			dao.deleteBook(id);
		}
		
	}

	@Override
	public void updateBook(Book book, String title) {
	
		if(book != null){
			dao.updateBook(book, title);
			
		}
		
		
		
	}

}
