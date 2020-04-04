<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Failed</title>
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
<h1>OOPS!!!!!....Invalid Login Details...</h1><br>
<input class="button"  value="Retry" onclick="window.location.href='${pageContext.request.contextPath}/login';return false;">
</body>
</html>