<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!String mesg = "hello"; //private instance var%>
<body>
	<%
	String mesg2 = "hi there !";//method local var - _jspService
	pageContext.setAttribute("nm", 12345);//nm - page scoped attr
	%>
	<%@ include file="test3.jsp"%>
</body>
</html>