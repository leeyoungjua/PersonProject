<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output</title>
</head>
<body>
	<table border=1>
		<tr>
			<th>Person Information
		</tr>
		<tr>
			<th>ID
			<th>NAME
			<th>CONTACT
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td>{i.id}</td>
				<td>{i.name}</td>
				<td>{i.contact}</td>
			</tr>
		</c:forEach>
		<tr>
			<td><button id="btn_return">Return</button></td>
		</tr>
	</table>
	<script>
		document.getElementById("btn_return").onclick = function(){
			location.href="/";
		}
	</script>
</body>
</html>