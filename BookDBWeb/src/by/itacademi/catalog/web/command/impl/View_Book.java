package by.itacademi.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.web.command.BasicAction;

public class View_Book implements BasicAction {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body>" + "<form action='MainServlet' metod='get' >"
				+ "View book by id <input type='text' name='id'/>" 
				+ "<input type='hidden' name='command' value='view_book_by_id'/>" 
				+ "<input type='submit' value='set'/>" 
				+ "</form>" + "</body>");

		return null;
	}

}
