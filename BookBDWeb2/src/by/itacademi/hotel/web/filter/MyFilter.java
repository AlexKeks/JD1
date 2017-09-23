package by.itacademi.hotel.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements javax.servlet.Filter {

	private String coding;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain next)
			throws IOException, ServletException {
		coding = request.getLocalAddr(); 
		  System.out.println("Filter. IP: " + coding);
		  next.doFilter(request, response);
	}

	@Override
	public void destroy() {
		
		Filter.super.destroy();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		Filter.super.init(filterConfig);
	}

}
