<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeInfo info = (EmployeeInfo) request.getAttribute("info");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
	<a href='./home'>Home</a>
	<a style='float: right' href='./logout'>LogOut</a>
	<table align='center' border='2'>
		<%
			if (info != null) {
		%>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td><%=info.getId()%></td>
			<td><%=info.getName()%></td>
			<td><%=info.getEmail()%></td>
			<td><%=info.getPassword()%></td>
		</tr>
		<%
			} else {
		%>
		<tr>
			<td>No data found</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>