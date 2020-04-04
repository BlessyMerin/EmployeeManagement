<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Error</title>
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
<h1>Please specify search criteria or enter a valid EmpID.</h1>
<input class="button"  value="Ok" onclick="window.location.href='${pageContext.request.contextPath}/employee/list';return false;">

</body>
</html>