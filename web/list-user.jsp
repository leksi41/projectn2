<%--
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
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr>
               <th>ID</th>
               <th>Login</th>
               <th>password</th>
               <th>Actions</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var = "user" items="${users}">
                <tr>
                    <td>
                        <c:out value = "${user.id}"/>
                    </td>

                    <td>
                        <c:out value = "${user.login}"/>
                    </td>

                    <td>
                        <c:out value = "${user.password}"/>
                    </td>

                    <td>
                        <a href="edit?id=<c:out value="${user.id}"/> " > Edit</a>
                        <a href="delete?id=<c:out value="${user.id}"/>"> Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
