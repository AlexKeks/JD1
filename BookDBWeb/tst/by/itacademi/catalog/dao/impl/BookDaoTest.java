package by.itacademi.catalog.dao.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import by.itacademi.catalog.dao.BookDao;

public class BookDaoTest {

	private static BookDao dao;
	
	@BeforeClass
	public static void initTest(){
		dao  = new BookDaoImpl();
		
	}
	
	@Test
	public void testReadBooksNotNull() {
		assertNotNull("The books was not read", dao.readBooks());
	}
	@Test
	public void testReadBooksNotEmpty(){
		assertNotNull("EMPTY: The books was not read", dao.readBooks());		
		assertTrue("The book list contains zero books " , dao.readBooks().size()>0);
	}
	
	/*@Test
	public void testReadBookNotNull(int i){
		assertNotNull("The books was not read", dao.readBook(i));
	}*/
	
	
}
