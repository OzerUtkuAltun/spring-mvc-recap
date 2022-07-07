<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--form taglerini kullanabilmek için taglib yapmamız gerekiyor.--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>

<form:form action="/customers/process-customer-form" modelAttribute="customer">

    First name: <form:input path="firstName"/> <br>
    Last name: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/> <br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
