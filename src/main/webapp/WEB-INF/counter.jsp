<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>index</title>
</head>
<body>
    <p>You have visited <a href = "http://localhost:8080">http://your_server</a> <c:out value="${ count }"/> times</p>
</body>
</html>