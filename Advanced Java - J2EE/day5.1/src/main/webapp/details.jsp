<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5 style="color: Green;">Login Successful</h5>
	<h6>User Details -${sessionScope.user_dtls}</h6>
	<%
	  String url=response.encodeURL("logout.jsp");
	%>
	<h5>
		<a href="<%= url %>">Log Out</a>
	</h5>
</body>
</html>