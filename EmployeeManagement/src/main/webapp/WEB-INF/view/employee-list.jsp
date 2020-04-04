<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
<ul class="menu" style="font-size:22px;">
  <li><a class="active" href="${pageContext.request.contextPath}/employee/list">Employee List</a></li>&nbsp;&nbsp;&nbsp;&nbsp;
  <li><a href="${pageContext.request.contextPath}/employee/showFormForAdd">Add New Employee</a></li>&nbsp;&nbsp;&nbsp;&nbsp;
  <li><a href="${pageContext.request.contextPath}/login">Logout</a></li>
  <div class="search">
		<form method="post" action="search">
			<input type="number" name="id" placeholder="Search Employee ID..">
			<button type="submit" >Search</button>
		</form>
  
</ul>
<h2 style="font-family: 'Roboto', sans-serif;font-weight:bold;">Employee List</h2>

<table>
		<tr>
			<th>EmpID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Contact Number</th>
			<th>Gender</th>
			<th>Age</th>
			<th>JobLocation</th>
			<th>BU</th>
			<th>ProjectID</th>
			<th>Job Title</th>
			<th>DOJ</th>
			<th>Salary</th>
			
		</tr>
		
		 
		
		<c:forEach var="temp" items="${employees}">
		
		<!-- Construct an update link -->
		<c:url var="updateLink" value="/employee/showFormForUpdate">
		<c:param name="employeeId" value="${temp.id }"></c:param>
		</c:url>
		
		
		<!-- For delete -->
		<c:url var="deleteLink" value="/employee/delete">
		<c:param name="employeeId" value="${temp.id }"></c:param>
		</c:url>
		
		
		
		<tr>
			
			<td>${temp.id}</td>
			<td>${temp.firstName}</td>
			<td>${temp.lastName}</td>
			<td>${temp.email}</td>
			<td>${temp.contact}</td>
			<td>${temp.gender}</td>
			<td>${temp.age}</td>
			<td>${temp.jobLocation}</td>
			<td>${temp.bu}</td>
			<td>${temp.prjId}</td>
			<td>${temp.jobTitle}</td>
			<td>${temp.doj}</td>
			<td>${temp.salary}</td>
			
			<td><input type="button" onclick="window.location.href='${updateLink }';return false;" value="Update"></td>
			<br>
			<td><input type="button" onclick="window.location.href='${deleteLink }';return false;" value="Delete"></td>
			</tr>
</c:forEach>
</table>

</body>
</html>