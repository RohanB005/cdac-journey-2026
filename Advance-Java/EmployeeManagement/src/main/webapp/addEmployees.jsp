<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
	<h2>Add Employee</h2>
	
	<form action="EmployeeController?action=add" method=post>
		Name:
		<input type="text" name="name"><br><br>
		
		Department:
		<input type="text" name="department"><br><br>
		
		Salary:
		<input type="number" name="salary"><br><br>
		
		<input type="submit" value="Add Student">
		
	</form>
<br>

<a href="EmployeeController?action=list">View Employees</a>
</body>
</html>