<%--
  Created by IntelliJ IDEA.
  User: ozeru
  Date: 1.03.2022
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%--Not: jstl(jakarta standart tag library) 1.2 gerekiyor.--%>

<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
Firstname: <strong> ${student.firstName}</strong> <br>
LastName: <strong> ${student.lastName}</strong> <br>
Country: <strong> ${student.country}</strong><br>
Language: <strong>${student.favoriteLanguage}</strong>

</body>
</html>
