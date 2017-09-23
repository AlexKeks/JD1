package by.htp.bookStore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.bookStore.dao.AbstractDao;
import by.htp.bookStore.dao.BookDao;
import by.htp.bookStore.dao.DaoException;
import by.htp.bookStore.domain.entyty.Book;

public class BookMySQLImpl extends AbstractDao implements BookDao {

	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	private static final String DB_USR = "root";
	private static final String DB_PAS = "root";
	private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";

	private static final String SQL_INSERT_BOOK = "INSERT INTO book (title, peges) VALUES (?, ?)";
	private static final String SQL_SELECT_BOOK = "SELECT * FROM book WHERE id = ?";
	// private static final String SQL_UPDATE_BOOK_TITLE = "INSERT INTO book (title) VALUES (?)";
	private static final String SQL_UPDATE_BOOK_TITLE = "UPDATE book SET title = ? WHERE title = ?";
	private static final String SQL_DELETE_BOOK = "DELETE FROM book WHERE id = ?";

	@Override
	public List<Book> readBooks() {

		List<Book> books = null;

		try {

			Class.forName(DB_Driver);
			Connection cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from book");

			books = new ArrayList<Book>();

			while (rs.next()) {

				Book book = new Book();
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int pages = rs.getInt(3);

				book.setId(id);
				book.setTitle(title);
				book.setPageCount(pages);

				books.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//return books;
		return null;
	}

	@Override
	public Book readBook(int id) throws DaoException {

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Book book = null;

		try {
			Class.forName(DB_Driver);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			ps = cn.prepareStatement(SQL_SELECT_BOOK);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next() != false) {

				book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPageCount(rs.getInt("peges"));
			}

		} catch (ClassNotFoundException e) {
			throw new DaoException("Driver was not faund", e);
		} catch (SQLException e) {
			throw new DaoException("Problem with reading book", e);
		}

		return book;
	}

	@Override
	public void updateBook(Book book, String title) {

		Connection cn = null;
		PreparedStatement ps = null;

		try {
			Class.forName(DB_Driver);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			ps = cn.prepareStatement(SQL_UPDATE_BOOK_TITLE);
			ps.setString(1, title);
			ps.setString(2, book.getTitle());
			ps.executeUpdate();
		
		} catch (Exception e) {
			
		}
		finally {
			closeStatement(ps);
			closeConnetion(cn);
		}

	}

	@Override
	public void deleteBook(int id) {
		Connection cn = null;
		PreparedStatement ps = null;

		try {
			Class.forName(DB_Driver);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			ps = cn.prepareStatement(SQL_DELETE_BOOK);
			ps.setInt(1, id);

			ps.executeUpdate();

		}

		catch (ClassNotFoundException e) { // как избавитсья от нотфанжд экс?
											// можно написать методы в
											// эбстрактДао

			e.printStackTrace();
		} catch (SQLException e) {
			try {
				throw new DaoException("Problem with database connetion", e);
			} catch (DaoException e1) {

				e1.printStackTrace();
			}
		} finally {
			closeStatement(ps);
			closeConnetion(cn);
		}

	}

	@Override
	public void addBook(Book book) throws DaoException {

		PreparedStatement ps = null;
		Connection cn = null;

		try {
			Class.forName(DB_Driver);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			try {
				ps = cn.prepareStatement(SQL_INSERT_BOOK);
				ps.setString(1, book.getTitle());
				ps.setInt(2, book.getPageCount());
				ps.executeUpdate();
			} catch (SQLException e) {
				throw new DaoException("Problem with adding new book", e);
			} finally {
				closeStatement(ps);
			}

		} catch (ClassNotFoundException e) { // как избавитсья от нотфанжд экс?
												// можно написать методы в
												// эбстрактДао

			e.printStackTrace();
		} catch (SQLException e) {
			throw new DaoException("Problem with database connetion", e);
		} finally {
			closeConnetion(cn);
		}
	}

}
