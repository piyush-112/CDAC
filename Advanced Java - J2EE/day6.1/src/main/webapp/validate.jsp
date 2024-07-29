<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%--create JB instance n add it under session scope --%>
<jsp:useBean id="user" class="com.app.beans.UserBean" 
scope="session"/>
<%-- create candidate bean --%>
<jsp:useBean id="candidate_bean" 
class="com.app.beans.CandidateBean" scope="session"/>
<%--invoke JB setters for the data xfer --%>
<jsp:setProperty property="*" name="user"/>
<%--invoke B.L method of the JavaBean --%>
<%-- <h5> Status - ${sessionScope.user.authenticateUser()}</h5> --%>
<%-- Navigate the clnt to next page in the NEXT request PRG--%>
<c:redirect url="${sessionScope.user.authenticateUser()}.jsp"/>
<body>

</body>
</html>