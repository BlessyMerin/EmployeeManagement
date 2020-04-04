<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/CSS/mainstyle.css">
</head>
<body>

<form:form action="saveEmployee" modelAttribute="employee" method="POST">

<table>
<tbody>
<input class="button"  onclick="window.location.href='${pageContext.request.contextPath}/employee/list';return false;" value="Employee List">
<tr>
<td><label>EmployeeId:</label></td>
<td><form:input path="id"/>
</td>
</tr>

<tr>
<td><label>First Name:</label></td>
<td><form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/></td>
</tr>

<tr>
<td><label>Last Name:</label></td>
<td><form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/></td>
</tr>

<tr>
<td><label>Email:</label></td>
<td><form:input path="email"/>
<form:errors path="email" cssClass="error"/></td>
</tr>

<tr>
<td><label>Contact Number:</label></td>
<td><form:input path="contact"/>
<form:errors path="contact" cssClass="error"/></td>
</tr>

<tr>
<td><label>Gender:</label></td>
<td><form:input path="gender"/>
<form:errors path="gender" cssClass="error"/></td>
</tr>

<tr>
<td><label>Age:</label></td>
<td><form:input path="age"/>
<form:errors path="age" cssClass="error"/></td>
</tr>

<tr>
<td><label>Job Location:</label></td>
<td><form:input path="jobLocation"/>
<form:errors path="jobLocation" cssClass="error"/></td>
</tr>

<tr>
<td><label>BU:</label></td>
<td><form:input path="bu"/>
<form:errors path="bu" cssClass="error"/></td>
</tr>

<tr>
<td><label>Project Id:</label></td>
<td><form:input path="prjId"/>
<form:errors path="prjId" cssClass="error"/>
</td>
</tr>

<tr>
<td><label>Job Title:</label></td>
<td><form:input path="jobTitle"/>
<form:errors path="jobTitle" cssClass="error"/></td>
</tr>

<tr>
<td><label>DOJ:</label></td>
<td><form:input path="doj"/>
<form:errors path="doj" cssClass="error"/></td>
</tr>

<tr>
<td><label>Salary:</label></td>
<td><form:input path="salary"/>
<form:errors path="salary" cssClass="error"/></td>
</tr>
<tr>
<td><label></label></td>
<td><input type="submit" value="Save"/></td>
</tr>
</tbody></table>
</form:form>
</body>
</html>