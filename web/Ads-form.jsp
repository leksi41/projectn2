<%--
  Created by IntelliJ IDEA.
  User: kids1
  Date: 22.05.2022
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактор объявления</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/ads-add" method="post">

    <label>Заголовок</label>
    <input type="text" name="title">
    <br>
    <label>Подзаголовок</label>
    <input type="text" name="subtitle">
    <br>
    <label>Текст объявления</label>
    <textarea name="description"></textarea>
    <br>
    <label>Цена</label>
    <input type="text" name="price">
    <br>

    <button type="submit">Save</button>

</form>

</body>
</html>
