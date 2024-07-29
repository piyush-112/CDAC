<%@page import="java.util.HashMap"%>
<%@page import="com.app.pojos.User"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!Map<String, User> users;

	public void jspInit() {
		users = new HashMap<>();
		users.put("rama@gmail.com", new User("rama@gmail.com", "1234", "Rama Kher", 25));
		users.put("mihir@gmail.com", new User("mihir@gmail.com", "2234", "Mihir Patil", 35));
		System.out.println("map created...");
	}%>
<body>
	<%
	//validation logic
	String email = request.getParameter("em");
	String password = request.getParameter("pass");
	User user = users.get(email);
	if (user != null) {
		//email valid
		if (user.getPassword().equals(password)) {
			//pwd valid ,store user details under session scope
			session.setAttribute("user_dtls", user);
			//redirect + URL rewriting(encoding)
			RequestDispatcher dr=request.getRequestDispatcher("details.jsp");
			dr.forward(request, response);
		//	response.sendRedirect(
		//			response.encodeRedirectURL("details.jsp"));

		} else {
	%>
	<h5 style="color: red;">
		Invalid Password , Please <a href="login2.jsp">Retry</a>
	</h5>
	<%
	}
	} else {
	%>
	<h5 style="color: red;">
		Invalid Email , Please <a href="login2.jsp">Retry</a>
	</h5>
	<%
	}
	%>
</body>
<%!public void jspDestroy() {
		users = null;
	}%>
</html>