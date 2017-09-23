package by.htp.Ls3classwork;

public class Book {
	private int pagesCount;
	private int publishYear;
	private String title;
	private Autor autor;

	public Book(int page, int publish, String title, Autor autor) {
		pagesCount = page;
		publishYear = publish;
		this.title = title;
		this.autor = autor;

		System.out.println("Book construktor");
	}

	public String getAutorSurname() {
		return autor.surname;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public static void main(String[] args) {

	}

}
