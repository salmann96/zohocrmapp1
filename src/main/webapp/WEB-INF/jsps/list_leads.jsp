<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListAll</title>
</head>
<body>
<h2>All List</h2>
<table  border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>

			<c:forEach var="lead" items="${leads}">
				<tr>
				<td><a href="findById?id=${lead.id}">${lead.firstname}</a></td>
				<td>${lead.lastname}</td>
				<td>${lead.email}</td>
				<td>${lead.mobile}</td>
				<td>${lead.source}</td>
				</tr>
			</c:forEach>
		</tr>
</table>
</body>
</html>