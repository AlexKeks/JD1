package by.itacademi.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.domain.entyty.Book;
import by.itacademi.catalog.domain.vo.Catalog;
import by.itacademi.catalog.service.CatalogService;
import by.itacademi.catalog.service.impl.SimpleCatalogImpl;
import by.itacademi.catalog.web.command.BasicAction;

public class ViewBookList implements BasicAction {

	private CatalogService service = new SimpleCatalogImpl();

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		Catalog catalog = service.getCatalog();

		out.print("<html><head></head><body>" + "<form action='MainServlet' metod='get' >");
		for (Book book : catalog.getBooks()) {
			out.println("<a href=http://localhost:8080/BookDBWeb/MainServlet?id=" + book.getId()
					+ "&command=view_book_by_id>" + book + "</a>" + "<br>");
		}

		out.println("</form>" + "</body>");
		return null;
	}

}
