package by.htp.bookStore.view.impl;

import by.htp.bookStore.domain.entyty.Book;
import by.htp.bookStore.domain.vo.Catalog;
import by.htp.bookStore.view.SimpleUserOutputter;

public class ConsoleOutput implements SimpleUserOutputter{

	@Override
	public void printBookCatalog(Catalog books) {

		if (books != null){
			
			System.out.println("Catalog title: "+ books.getTitle());
			System.out.println("Catalog creation date: " + books.getDateCreation());
			
			if(books.getBooks()!=null){
				for(Book book: books.getBooks()){
					System.out.println(book);
				}
			}
			
		}
		
	}

		 
}
