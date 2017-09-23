package by.htp.bookStore.dao.impl.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.bookStore.dao.BookDao;
import by.htp.bookStore.dao.DaoException;
import by.htp.bookStore.domain.entyty.Book;

public class BookSaxParser implements BookDao {

	@Override
	public List<Book> readBooks() {
		// impliment sax Parser here
		List<Book> books = new ArrayList<Book>();
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();

			reader.setContentHandler(new BookHendler());
			try {
				reader.parse("xmldocs/books.xml");

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (SAXException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book readBook(int id) throws DaoException {
		//// not to impliment
		return null;
	}

	@Override
	public void deleteBook(int id) {
		//// not to impliment

	}

	@Override
	public void addBook(Book book) throws DaoException {
		// //not to impliment

	}

	@Override
	public void updateBook(Book book, String title) {
		//// not to impliment
		
	}

}
