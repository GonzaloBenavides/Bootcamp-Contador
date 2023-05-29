<%@page import="org.springframework.ui.Model"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/boostrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<title>Current count</title>
</head>
<body>
	<div>
		Has visitado <a href="/">localhost</a> ${count} veces.
	</div>
	<div>
		<a href="/">¿Probamos visitando de nuevo?</a>
	</div>
</body>
</html>