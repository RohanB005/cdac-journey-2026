<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.student.model.Student"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>

<h2>Student List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Age</th>
<th>Course</th>
<th>Action</th>
</tr>

<%
List<Student> list = (List<Student>)request.getAttribute("studentList");

if(list != null){

for(Student s : list){
%>

<tr>

<td><%= s.getId() %></td>
<td><%= s.getName() %></td>
<td><%= s.getAge() %></td>
<td><%= s.getCourse() %></td>

<td>

<a href="StudentController?action=delete&id=<%= s.getId() %>">
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

<a href="addStudent.jsp">Add New Student</a>

</body>
</html>