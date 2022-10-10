<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple JSP</title>
</head>
<body>
	<%
	out.println("<h2>My first JSP page.</h2>");
	%>
	<br>
	<h2>Scriptlet Example</h2>
	<%
	String name = "ABC";
	%>
	<br>
	<h2>Expression</h2>
	<%="My name is: " + name%>
	<br>
	<!-- -jav code -->
	<%!int cube(int n) {

		return n * n * n;
	}%>
	<%="cube of 5 is: " + cube(5)%>
	<br>
	<%=new java.util.Date()%>
	<br>
	<%
	int a = 10;
	int b = 20;
	int c = a + b;
	out.print("Result is : " + c);
	%>


</body>
</html>
