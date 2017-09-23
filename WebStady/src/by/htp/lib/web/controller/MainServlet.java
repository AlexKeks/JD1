package by.htp.lib.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.lib.service.User;
import by.htp.lib.service.UserRole;


public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setAttribute("locale", Locale.US);
		
		String action = request.getParameter("action");
	
		if (action != null) {
			switch (action) {
			case "login":
				String login = request.getParameter("login");
				String password = request.getParameter("pass");

				if (login.equals("user") && password.equals("user")) {
					List<String> list = new ArrayList<String>();
					list.add("one");
					list.add("two");
					list.add("three");
					list.add("four");
					
					HashSet<User> userSet = new HashSet<User>();
					userSet.add(new User(1, "User1", UserRole.ADMIN));
					userSet.add(new User(2, "User2", UserRole.GUEST));
					userSet.add(new User(3, "User3", UserRole.USER));
					
					request.setAttribute("userSetParam", userSet);
					request.setAttribute("numbers", list);
					request.getRequestDispatcher("/Jsp/user.jsp").forward(request, response);
				}
				else if(login.equals("admin") && password.equals("admin")){
					List<String> list = new ArrayList<String>();
					list.add("one");
					list.add("two");
					list.add("three");
					list.add("four");
					list.add("five");
					list.add("six");
					list.add("seven");
					request.setAttribute("numbers", list);
					request.getRequestDispatcher("/Jsp/admin.jsp").forward(request, response);
				
				}else if(login.equals("1") && password.equals("1")) {
					ResourceBundle rb = ResourceBundle.getBundle("config");
					String msg = rb.getString("sample.string.servlet");
					String count = rb.getString("sample.string.servlet.number");
					if(count != null){
						int max = Integer.parseInt(count);
						for(int i=0; i<max; i++){
							System.out.println(msg + i);
						}
					}
				}

				break;

			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
