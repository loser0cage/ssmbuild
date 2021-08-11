<%--
  Created by IntelliJ IDEA.
  User: 28633
  Date: 2021/7/28
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有的账号</h3>
<c:forEach items="${list}" var="books">
    ${books.toString()}
</c:forEach>
</body>
</html>
