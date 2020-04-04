<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Display</title>
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
<input class="button"  onclick="window.location.href='${pageContext.request.contextPath}/employee/list';return false;" value="Employee List">
<br><br><br><br><br><br>
<h4 style="font-color:#4d004d;">Your Search Result.....</h4>
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
		<c:forEach var="emp" items="${employee}">
		<tr>
			
			<td>${emp.id}</td>
			<td>${emp.firstName}</td>
			<td>${emp.lastName}</td>
			<td>${emp.email}</td>
			<td>${emp.contact}</td>
			<td>${emp.gender}</td>
			<td>${emp.age}</td>
			<td>${emp.jobLocation}</td>
			<td>${emp.bu}</td>
			<td>${emp.prjId}</td>
			<td>${emp.jobTitle}</td>
			<td>${emp.doj}</td>
			<td>${emp.salary}</td>
			</tr>
</c:forEach>
</table>


</body>
</html>