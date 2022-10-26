<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leadInfo</title>
</head>
<body>

<h2>Lead Info</h2>

FirstName: ${lead.firstname}<br/>
lastName: ${lead.lastname}<br/>
Email: ${lead.email}<br/>
Mobile: ${lead.mobile}<br/>
Source: ${lead.source}<br/>

<form action="composeEmail" method="post">
<input type="hidden" value="${lead.email}" name="email"/>
<input type="submit" value="SendEmail"/>
</form>
<form action="ConvertLead" method="post">
<input type="hidden" value="${lead.id}" name="id"/>
<input type="submit" value="Convert"/>
</form>

</body>
</html>