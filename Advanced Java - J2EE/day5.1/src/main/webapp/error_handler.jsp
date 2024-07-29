<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handling Page</title>
</head>
<body>
<h5 style="color: red;">Error Mesg - ${pageContext.exception}</h5>
<h5 style="color: red;">Error Code - ${pageContext.errorData.statusCode}</h5>
<h5 style="color: red;">Error Causing Page - ${pageContext.errorData.requestURI}</h5>
</body>
</html>