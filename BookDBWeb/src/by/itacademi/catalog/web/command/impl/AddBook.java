package by.itacademi.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.web.command.BasicAction;

public class AddBook implements BasicAction {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body>" + "<form action='MainServlet' metod='get' >"
				+ "Create new book.<br><br>Title new book<input type='text' name='title'/><br>"
				+ "Amount pages<input type='text' name='pages'/>" 
				+ "<input type='hidden' name='command' value='add_book_action'/>" 
				+ "<br><input type='submit' value='add'/>" 
				+ "</form>" + "</body>");
		
		return null;
	}

}
