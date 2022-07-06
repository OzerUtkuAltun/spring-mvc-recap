<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--form taglerini kullanabilmek için taglib yapmamız gerekiyor.--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<form:form action="/students/process-student-form" modelAttribute="student">

    First name: <form:input path="firstName"/><br>
    Last name: <form:input path="lastName"/><br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
