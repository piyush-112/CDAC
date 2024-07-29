<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdditionFirst</title>
</head>
<body>
<%!
int a,b,c;
%>
<%
    try {
         a = 100;
         b = 200;
         c = a + b;
        out.println("<h1>The Addition is: " + c + "</h1>");
    } catch (Exception e) {
  		out.println(e.getStackTrace()); 
    }
%>
<h1>The Addition is &nbsp; <%=c%></h1>
</body>
</html>