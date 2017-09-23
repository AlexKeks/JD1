package by.htp.bookStore.run;

import by.htp.bookStore.domain.entyty.Book;
import by.htp.bookStore.domain.vo.Catalog;
import by.htp.bookStore.service.BookService;
import by.htp.bookStore.service.impl.BookServiceImpl;
import by.htp.bookStore.view.SimpleUserOutputter;
import by.htp.bookStore.view.impl.ConsoleOutput;

public class MainController {

	public static void main(String[] args) {
		
		BookService bookService= new BookServiceImpl();
		SimpleUserOutputter outputter = new ConsoleOutput();
	
		//получение каталога книг
		Catalog books = bookService.getBookCatalog();
		
		//вывод каталога книг
		outputter.printBookCatalog(books);
	
		//добавление новой книги с парам
/*		Book book = new Book(10, "Boooook", 100);
		bookService.addNewBook(book);
		System.out.println("Catalog after: ");
				
		//вывод каталога книг после добавления
		books = bookService.getBookCatalog();
		outputter.printBookCatalog(books);
		
		//get and print book by id
		Book printBook = bookService.getBook(4);
	
		System.out.println("get book: " + printBook);
		
		//update Book by title
		String title = "Book update";
		Book oldTitle = new Book ("Book2");
		bookService.updateBook(oldTitle, title);
		
		books = bookService.getBookCatalog();
		outputter.printBookCatalog(books);
	
		
		//delete book by id
/*		bookService.deleteBook(4);
		books = bookService.getBookCatalog();
		outputter.printBookCatalog(books);
*/		
		
		
	}

}
