<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
</head>
<body>
	<%--session.getAttribute("user_dtls").getName() : sent to clnt --%>
	<h5>Hello , ${sessionScope.user_dtls.name}</h5>
	<%-- invalidate the session --%>
	<%
	session.invalidate();
	%>
	<h5>You have logged out...</h5>
	<h5>
		<a href="login2.jsp">Visit Again</a>
	</h5>
</body>
</html>