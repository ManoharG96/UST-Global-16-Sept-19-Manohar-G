<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>
<body>
	<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>
			<table align='center'>
				<h4 style="color: red;"><%=msg %></h4>
				<tr>
					<td>Id</td>
					<td><input type='number' name='id' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td><input type='checkbox' name='rememberme' value='checked'></td>
					<td>Remember me</td>
				</tr>
				<tr>
					<td><input type='reset' name='reset'></td>
					<td><input type='submit' name='login'></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href='./register.jsp'>Register</a>
</body>
</html>