<!DOCTYPE html>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic of JSP and tags</title>
</head>
<%
	Date date = new Date();
	m();
%>
<%! 
public void jspInit(){
	System.out.println("jspInit() is overriden");
}
public void jspDestory(){
	System.out.println("jspDestory() is overriden");
}
%>
<%!
	public int i = 10;
	public void m(){
		System.out.println("i value in m(): "+i);
	}
%>
<body>
	Object obj = new Object();
	<h1 style="color: green;">
		Date and Time:
		<%=date%></h1>
	<h2 style="color: blue;">
		i value in m():
		<%=i%></h2>
</body>
</html>