<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo"
	scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<h1>Welcome "<%=info.getName() %></h1>
	<a href='./search.jsp'>Search</a>
	<a href='./changepassword.jsp'>changePassword</a>
	<a style="float: right;" href='./logout.jsp'>Logout</a>
</body>
</html>