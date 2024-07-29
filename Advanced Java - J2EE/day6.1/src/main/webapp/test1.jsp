<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>From 1st page</h4>
	<%
//	out.flush();
	String productDetails = request.getParameter("p_name")
+ "@" + request.getParameter("price");
	request.setAttribute("details", productDetails);
	%>
	<jsp:include page="test2.jsp">
		<jsp:param value="food" name="category" />
	</jsp:include>
</body>
</html>