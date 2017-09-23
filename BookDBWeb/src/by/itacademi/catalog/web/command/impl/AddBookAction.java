package by.itacademi.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.domain.entyty.Book;
import by.itacademi.catalog.service.CatalogService;
import by.itacademi.catalog.service.impl.SimpleCatalogImpl;
import by.itacademi.catalog.web.command.BasicAction;

public class AddBookAction implements BasicAction {

	private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Book book = new Book();
		book.setTitle( request.getParameter("title"));
		book.setPages(Integer.parseInt(request.getParameter("pages")));
		service.addBook(book);
		PrintWriter out = response.getWriter();
		
		out.println("New book: '" + book.getTitle()+ "', " + book.getPages() + ".");
		out.println("This book added to database");
		return null;
		
	
	}

}
