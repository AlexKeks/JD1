package by.itacademi.catalog.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.itacademi.catalog.dao.BookDao;
import by.itacademi.catalog.domain.entyty.Book;

public class BookDaoImpl implements BookDao {

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

	private static final String SQL_SELECT_BOOK = "select * from book";
	private static final String SQL_SELECT_BOOK_BY_ID = "SELECT * FROM book WHERE id = ?";
	private static final String SQL_ADD_BOOK = "INSERT INTO book (title, peges) VALUES (?, ?)";
	private static final String SQL_DELETE_BOOK = "DELETE FROM book WHERE id IN (?)";
//delete  mass  "SELECT * FROM `table` WHERE `table` IN (" . implode(",", $massiv) . ")";
	Connection con;
	Statement st;
	PreparedStatement ps;

	@Override
	public List<Book> readBooks() {

		List<Book> books = null;

		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOK);

			books = new ArrayList<Book>();

			Book book;
			while (rs.next()) {

				book = new Book();
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPages(rs.getInt(3));
				books.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

	@Override
	public Book readBook(int id) {

		Book book = null;

		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ps = con.prepareStatement(SQL_SELECT_BOOK_BY_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next() != false) {

				book = new Book();
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPages(rs.getInt(3));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
	}

	@Override
	public void addBookDao(Book book) {

		try {

			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ps = con.prepareStatement(SQL_ADD_BOOK);
			ps.setString(1, book.getTitle());
			ps.setInt(2, book.getPages());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteBook(int[] bookId) {
		
		try {

			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			String s = null;
			ps = con.prepareStatement(SQL_DELETE_BOOK);
			for(int i=0;i<bookId.length;i++){
			s= s+ bookId[i]+", ";
			}
			ps.setString(1, s);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
