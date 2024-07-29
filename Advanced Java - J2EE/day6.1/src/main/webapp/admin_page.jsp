<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<h5>Hello , ${sessionScope.user.userDetails.firstName}
		${sessionScope.user.userDetails.lastName}</h5>
	<h6>You have logged in as ${sessionScope.user.userDetails.role}</h6>
	<%--send top 2 candidates to clnt --%>
	<table style="background-color: lightgrey; margin: auto" border="1">
		<caption>Top 2 Candidates</caption>
		<c:forEach var="candidate"
			items="${sessionScope.candidate_bean.candidates}">
			<tr>
				<td>${candidate.candidateId}</td>
				<td>${candidate.name}</td>
				<td>${candidate.party}</td>
				<td>${candidate.votes}</td>
			</tr>
		</c:forEach>
	</table>
	<table style="background-color: lightgrey; margin: auto" border="1">
		<caption>Party wise Votes</caption>
		<c:forEach var="entry"
			items="${sessionScope.candidate_bean.partyVotes}">
			<tr>
				<td>${entry.key}</td>
				<td>${entry.value}</td>
			</tr>
		</c:forEach>
	</table>
	<h5>
		<a href="logout.jsp">Log Me Out</a>
	</h5>


</body>
</html>