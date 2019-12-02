<%@page import="com.ustglobal.productspringmvc.dto.RetailerBean"%>
<%@page import="com.ustglobal.productspringmvc.dto.ProductBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<%
	ProductBean productBean = (ProductBean) request.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order List</title>
</head>
<body>
	<fieldset>
	<form action="./orderlist" method="get">
		<%
			if (productBean != null) {
		%>
		<table border="1px">
			<tr>
				<th>Order Id</th>
				<th>Product Name</th>
				<th>Retailer Id</th>
				<th>Price Per Unit</th>
			</tr>
			<tr>
				<td><%=productBean.getOrderId()%></td>
				<td><%=productBean.getProductName()%></td>
				<td><%=productBean.getPricePerUnit()%></td>
				<td><%=bean.getRetailerId()%></td>
			</tr>
		</table>
		<%
			}
		%>
		</form>
	</fieldset>
</body>
</html>