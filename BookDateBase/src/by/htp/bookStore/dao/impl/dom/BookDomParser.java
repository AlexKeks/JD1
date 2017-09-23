package by.htp.bookStore.dao.impl.dom;

import java.util.List;

import by.htp.bookStore.dao.BookDao;
import by.htp.bookStore.dao.DaoException;
import by.htp.bookStore.domain.entyty.Book;

public class BookDomParser implements BookDao{

	@Override
	public List<Book> readBooks() {
		// impliment sax Parser here
		return null;
	}

	@Override
	public Book readBook(int id) throws DaoException {
		////not to impliment
		return null;
	}

	@Override
	public void deleteBook(int id) {
		////not to impliment
		
	}

	@Override
	public void addBook(Book book) throws DaoException {
		// //not to impliment
		
	}

	@Override
	public void updateBook(Book book, String title) {
		////not to impliment
		
	}

}
