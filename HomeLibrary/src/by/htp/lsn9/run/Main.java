package by.htp.lsn9.run;

import by.htp.lsn9.Autor;
import by.htp.lsn9.Book;
import by.htp.lsn9.Library;


public class Main {
	
	public static void main(String[] args) {

	Library lib = new Library("lib1");
	
	lib.setBooks(new Book[5]);
	
	Autor a1 = new Autor("Autor1","SurN a1"); 
	Book b1 = new Book("titltBook1",2001,a1);
	
	Autor a2 = new Autor("Autor2","SurN a2"); 
	Book b2 = new Book("titleBook2",2002,a2);
	
	Autor a3 = new Autor("Autor3","SurN a3"); 
	Book b3 = new Book("titleBook3",2004,a3);
	
	Autor a4 = new Autor("Autor4","SurN a4"); 
	Book b4 = new Book("titleBook4",2004,a4);
	
		
	lib.addBook(b1);
	lib.addBook(b2);
	lib.addBook(b3);
	lib.addBook(b4);
	
	System.out.println(lib.getNameLib());
	for(Book i:lib.getBooks()){
		if(i.getTitleBook() != null){
	System.out.println(i.getTitleBook());
		}
	}
	
	
}}