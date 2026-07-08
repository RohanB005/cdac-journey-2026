<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.demo.model.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>

<h2>Employee List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Salary</th>
<th>Action</th>
</tr>

<%
List<Employee> list = (List<Employee>)request.getAttribute("employeeList");

if(list != null){

for(Employee e : list){
%>

<tr>

<td><%= e.getEmpId() %></td>
<td><%= e.getEmpName() %></td>
<td><%= e.getDepartment() %></td>
<td><%= e.getSalary() %></td>

<td>

<a href="EmployeeController?action=delete&id=<%= e.getEmpId() %>">
Delete
</a>

</td>

</tr>

<%
}
}
%>

</table>

<br>

<a href="addEmployees.jsp">Add New Student</a>

</body>
</html>