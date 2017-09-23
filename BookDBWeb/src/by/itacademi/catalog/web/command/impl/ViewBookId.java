package by.itacademi.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.domain.entyty.Book;
import by.itacademi.catalog.service.CatalogService;
import by.itacademi.catalog.service.impl.SimpleCatalogImpl;
import by.itacademi.catalog.web.command.BasicAction;

public class ViewBookId implements BasicAction {

	private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("id");
		PrintWriter out = response.getWriter();
		Book book = service.getBook(Integer.parseInt(id));
		if(book!=null){
		out.println(book);
		}
		else out.println("The book with this id is not in the database");
		return null;
	}

}
