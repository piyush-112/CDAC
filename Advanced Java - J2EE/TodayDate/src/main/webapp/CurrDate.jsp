<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %> <%--Derective Tag --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!		
	Date d;
%><%--Declaration Tag --%>
<body>
<%
	d=new Date();
%><%--Scriptlate Tag --%>
<h1>Todays date is &nbsp; <%=d %></h1><%--Expression Tag --%>
</body>
</html>