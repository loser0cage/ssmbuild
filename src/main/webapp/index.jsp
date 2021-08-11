<%--
  Created by IntelliJ IDEA.
  User: 28633
  Date: 2021/7/28
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="books/findAll">测试</a>
    <h3>测试包</h3>
<form action="/books/save" method="post">
    书籍编号: <input type="text" name="bookID"/>
    书名:<input type="text" name="bookName"/>
    库存:<input type="text" name="bookCounts"/>
    细节:<input type="text" name="detail"/>
    <input type="submit" value="保存"><br/>
</form>
</body>
</html>
