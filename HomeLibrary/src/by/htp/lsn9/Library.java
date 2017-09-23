package by.htp.lsn9;

public class Library {
	
	private String nameLib;
	private Book[] books;
	int i = 0;

	public Library(String nameLib){
		this.nameLib = nameLib;
		books = new Book[3];
	}
	
	public String getNameLib() {
		return nameLib;
	}

	public void addBook(Book book) {
		if (i < books.length) {
			books[i] = book;
			
		} 
		else {
			int oldBooks = books.length;
			Book[] newBooks = new Book[oldBooks + 10];
			for (int i=0;i<books.length;i++){
				newBooks[i] = books[i];
			}
			newBooks[i]= book;

		}
		i++;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void delBookByTitle(String title) {
		int j = 0;
		for (Book i : books) {
			if (i.getTitleBook().equals(title)) {
				books[j] = null;
			}
			j++;
		}
	}

	public void sortBooksByTitle(int publishYear) {
		int yearMax = 0;
		for (Book i : books) {
			if (yearMax < i.getYearBook()) {
				yearMax = i.getYearBook();
			}
		}

	}
}
