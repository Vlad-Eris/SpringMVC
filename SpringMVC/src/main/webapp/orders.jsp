<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Orders</title>
</head>
<body>
    <h1>All Orders</h1>
    <c:forEach items="${orders}" var="order">
        <p>ID: ${order.id}, Customer: ${order.customerName}, Total: ${order.totalAmount}</p>
    </c:forEach>
</body>
</html>