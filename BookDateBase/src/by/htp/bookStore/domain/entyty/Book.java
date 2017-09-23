package by.htp.bookStore.domain.entyty;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = -1298227585194758758L;
	
	private int id;
	private String title;
	private int pageCount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Book(int id, String title, int pageCount) {
		super();
		this.id = id;
		this.title = title;
		this.pageCount = pageCount;
	}
	public Book() {
		super();
	
	}
	public Book(String title) {
		super();
		this.title = title;
	
	}
	@Override
	public String toString() {
		return "Book id: " + id + ", title: " + title + ", pageCount: " + pageCount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + pageCount;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
	
	
	

}
