<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!//JSP declaration block
	public void jspInit() {
		System.out.println("in init ");
	}%>
<body>
	<%--Using Some of the Scripting elements --%>
	<h4 align="center">Display request params using a scriptlet</h4>
	<%
	out.print("<h5>Email " + request.getParameter("em") + "<br/>");
	out.print("Password  " + request.getParameter("pass") + "</h5>");
	%>
	<hr />
	<h4 align="center">Display request params using an expression</h4>
	<h5>
		Email -
		<%=request.getParameter("em")%></h5>
	<h5>
		Password -
		<%=request.getParameter("pass")%></h5>

	<hr />
	<h4 align="center">Display request params using EL syntax</h4>
	<h5>Email - ${param.em}</h5>
	<h5>Password - ${param.pass}</h5>
	<h5>param - ${param}</h5>
	<hr />
</body>
<%!//JSP declaration block
	public void jspDestroy() {
		System.out.println("in destroy ");
	}%>
</html>