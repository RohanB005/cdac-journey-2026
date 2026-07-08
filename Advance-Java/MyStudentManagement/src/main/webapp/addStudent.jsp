<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>

<h2>Add Student</h2>

<form action="StudentController?action=add" method="post">

    Name :
    <input type="text" name="name"><br><br>

    Age :
    <input type="number" name="age"><br><br>

    Course :
    <input type="text" name="course"><br><br>

    <input type="submit" value="Add Student">

</form>

<br>

<a href="StudentController?action=list">View Students</a>

</body>
</html>