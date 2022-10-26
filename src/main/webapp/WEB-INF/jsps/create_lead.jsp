<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>

<h2>Create|Lead</h2>
<form action="saveLead" method="post">
<pre>
FirstName<input type="text" name="firstname"/>
LastName:<input type="text" name="lastname"/>
Email:<input type="text" name="email"/>
Mobile:<input type="text" name="mobile"/>
Source:
<select name="source">
  <option value="NewsPaper">NewsPaper</option>
  <option value="Online">Online</option>
  <option value="Television">Television</option>
  <option value="Internet">Internet</option>
</select>
<input type="submit" value="Save">
</pre>
</form>
</body>
</html>