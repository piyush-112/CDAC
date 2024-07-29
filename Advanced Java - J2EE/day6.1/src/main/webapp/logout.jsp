<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>
		<c:set var="user_dtls" value="${sessionScope.user.userDetails}" />
		Hello ,${user_dtls.firstName} ${user_dtls.lastName}
	</h5>
	<h6>You have logged in as ${user_dtls.role}</h6>
	<c:choose>
		<c:when test="${user_dtls.role eq 'admin'}">
			<h5>
				<a href="login.jsp">Visit Again</a>
			</h5>
		</c:when>
		<c:otherwise>
			<h4>Add voter related</h4>
		</c:otherwise>
	</c:choose>
	<%-- discard session w/o using a scriptlet--%>
	${pageContext.session.invalidate()}
	

</body>
</html>