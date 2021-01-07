<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	
	<form action="/person/input.person">
	<input type=text name=name placeholder="name 입력" required><br>
    <input type=text name=contact placeholder="contact 입력" required><br>
    <input type=submit value="입력">
	</form>
</body>
</html>