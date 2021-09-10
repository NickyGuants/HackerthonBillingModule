<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View orders</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Order Id</th>
        <th>Service</th>
        <th>Unit Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td>${order.orderId}</td>
            <td>${order.service}</td>
            <td>${order.unitPrice}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>