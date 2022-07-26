<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Products</title>
</head>
<body>
<table>
	<tr><th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th></tr>
	<c:forEach var="product" items="${list}">  
	<tr> 
		<td>${product.id}</td>
		<td>${product.name}</td>
		<td>${product.price}</td>
		<td>${product.dateAdded}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
