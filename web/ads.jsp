<%@ page import="static com.company.web.Util.URL" %><%--
  Created by IntelliJ IDEA.
  User: prepod2
  Date: 12.05.2022
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Главная страница</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<%=URL%>/css.css">
</head>
<body>
<div class="header">
    <div class="logo">
        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Steam_icon_logo.svg/768px-Steam_icon_logo.svg.png" alt="картинка">
    </div>

    <div class="auth">
        <a class="btn btn-outline-success" href="#">SignIn</a>
        <a class="btn btn-outline-danger" href="#">SignUp</a>
    </div>
</div>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
        </li>
    </ul>
</nav>
<a class="btn btn-success" href="<%=request.getContextPath()%>/ads-new">
    created ads
</a>
<c:forEach var="ads" items="${ads}">
    <div class="container">
        <div class="search">

        </div>
        <div class="content">
            <div class="ads">
                <img src="<%=URL%>/img/ads.jpg">
            </div>
            <div class="content-body">
                <h2 style="color: black;"><c:out value="${ads.title}"/></h2>
                <h5 style="color: green;"><c:out value="${ads.subtitle}"/></h5>
                <span>
					<p><c:out value="${ads.description}"/><a href="#">Подробнее</a></p>
				</span>
                <div class="price" style="color: orange; font-size: 25px; ">
                    <b><c:out value="${ads.price}"/></b>
                </div>
                <a class="edit-ads btn btn-outline-dark" href="#">Редактировать</a>
            </div>
        </div>
    </div>

</c:forEach>
<footer>
    footer
</footer>

</body>
</html>
