package by.htp.lsn9;

public class Book {
	private Autor autor;
	private String title;
	private int publishYyear;

	public Book(String title){
		this.title=title;
	}
	
	public Book(String title, int publishYear, Autor autor){
		this.title = title;
		this.publishYyear = publishYear;
		this.autor = autor;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitleBook() {
		return title;
	}

	public void setTitleBook(String nameBook) {
		this.title = nameBook;
	}

	public int getYearBook() {
		return publishYyear;
	}

	public void setYearBook(int yearBook) {
		this.publishYyear = yearBook;
	}
	
	
	
	

}
