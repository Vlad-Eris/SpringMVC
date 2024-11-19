<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Phones</title>
</head>
<body>
    <h1>All Phones</h1>
    <c:forEach items="${phones}" var="phone">
        <p>ID: ${phone.id}, Brand: ${phone.brand}, Model: ${phone.model}</p>
    </c:forEach>
</body>
</html>