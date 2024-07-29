<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>From the included page .....</h3>
	<h4>
		Instance var -
		<%=mesg%></h4>
	<h4>
		Local var -
		<%=mesg2%></h4>
		<h4>Page scoped attrubute - ${pageScope.nm}</h4>

</body>
</html>