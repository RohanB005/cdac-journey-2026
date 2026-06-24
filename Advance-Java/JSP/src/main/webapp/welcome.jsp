<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="login">
<title>Welcome</title>
</head>
<body>
<h2>
Welcome,
<%= request.getAttribute("username") %>
</h2>
</body>
</html>