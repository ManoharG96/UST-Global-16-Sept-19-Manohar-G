<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.Object" scope="request"></jsp:useBean>
<body>
	<a href="./home.jsp">Home</a>
	<h4 style="color: red;"><%=msg%></h4>
	<a style="float: right" href="./logout">Logout</a>
	<fieldset align="center">
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">
			<table align="center">
				<tr>
					<td>New Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Conform Password:</td>
					<td><input type="password" name="conformpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Change Password"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>