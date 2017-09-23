package by.itacademi.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.catalog.service.CatalogService;
import by.itacademi.catalog.service.impl.SimpleCatalogImpl;
import by.itacademi.catalog.web.command.BasicAction;

public class DeleteBookAction implements BasicAction {

	private CatalogService service = new SimpleCatalogImpl();

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
			String[]s;
			s =  request.getParameterValues("id");
			int[]a=new int[s.length];
			
			for(int i=0; i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
			}
			service.removeBook(a);
			out.println("The book will be deleted");
		
		return null;
	}


}
