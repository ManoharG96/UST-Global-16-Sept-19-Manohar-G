<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Details</title>
</head>
<body>
	<label>Enter Details</label>
	<form action="./form" method="post">

		<table>
			<tr>
				<th>Name</th>
				<th><input type="text" name="name"></th>
			</tr>
			<tr>
				<th>email</th>
				<th><input type="email" name="email"></th>
			</tr>
			<tr>
				<th>password</th>
				<th><input type="password" name="password"></th>
			</tr>
			<tr>
				<th><input type="submit" value="submit"> <input
					type="reset" value="reset"></th>
			</tr>
		</table>

	</form>
</body>
</html>