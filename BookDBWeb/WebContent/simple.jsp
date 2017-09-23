<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple page</title>
</head>
<body>
<form action='MainServlet' metod='get' >");
		
			<a href=http://localhost:8080/BookDBWeb/MainServlet?id= + book.getId()
					&command=view_book_by_id>" + book + "</a>" + "<br>
		</form></body>
Hello user!
</body>
</html>