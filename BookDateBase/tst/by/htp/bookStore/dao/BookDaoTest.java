package by.htp.bookStore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.bookStore.dao.impl.BookMySQLImpl;
import by.htp.bookStore.dao.impl.sax.BookSaxParser;
import by.htp.bookStore.domain.entyty.Book;

public class BookDaoTest {

	//private BookDao dao = new BookMySQLImpl();
	private static BookDao dao; 
	
	@BeforeClass
	public static void initTest(){
		dao = new BookSaxParser();
	}
	
	@Test
	public void testReadBooksNullList() {
		 List<Book> book = dao.readBooks();
		 assertNotNull(book);
			 
		 }
	
	@Test
	public void testReadBookEmptyList(){
		 List<Book> book = dao.readBooks();
		 assertTrue(book.size()>0);
	}
}
