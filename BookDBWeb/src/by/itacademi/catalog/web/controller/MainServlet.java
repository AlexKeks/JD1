package by.itacademi.catalog.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.domain.entyty.Book;
import by.itacademi.catalog.domain.vo.Catalog;
import by.itacademi.catalog.service.CatalogService;
import by.itacademi.catalog.service.impl.SimpleCatalogImpl;
import by.itacademi.catalog.web.command.ActionType;
import by.itacademi.catalog.web.command.BasicAction;
import by.itacademi.catalog.web.command.CommandChuse;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private int requestCount = 0;

	private CatalogService service;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("service method: " + requestCount);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy method: " + requestCount);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init method: " + requestCount);
		service = new SimpleCatalogImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("command");
		System.out.println(command);

		ActionType action = ActionType.valueOf(command.toUpperCase());
		BasicAction basicAction = CommandChuse.perforAction(action);
		basicAction.executeAction(request, response);

		/*
		 * PrintWriter out = response.getWriter();
		 * 
		 * if (command != null) { switch (command) {
		 * 
		 * case "view_books":
		 * 
		 * Catalog catalog = service.getCatalog(); for (Book book :
		 * catalog.getBooks()) { out.println(book); } break;
		 * 
		 * case "get_book":
		 * 
		 * String id = request.getParameter("id"); Book book =
		 * service.getBook(Integer.parseInt(id)); out.println(book);
		 * out.println("At home implement get by id"); break;
		 * 
		 * case "add_book": // showAddBookFrom(); Book bookNew = new Book();
		 * 
		 * out.println("At home implement add book, be happy, go sleep"); break;
		 * /* case "delete_book": showDeleteForm(out);
		 * 
		 * out.println("delete boooook"); break;
		 */
		/*
		 * case "total_delete": out.println("the book will be deleted"); String
		 * bookId=request.getParameter("book_id");
		 * service.removeBook(Integer.parseInt(bookId)); break;
		 * 
		 * } }
		 */
	}

	/*
	 * private void showDeleteForm(PrintWriter out) {
	 * out.print("<html><head></head><body>" +
	 * "<form action='MainServlet' metod='get' >" +
	 * "Delete book by id <input type='text' name='book_id'/>" +
	 * "<input type='hidden' name='command' value='total_delete'/>" +
	 * "<input type='submit' value='delete'/>" + "</form>" + "</body>"); }
	 */
}
