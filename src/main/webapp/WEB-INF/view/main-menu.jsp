<%--
  Created by IntelliJ IDEA.
  User: ozeru
  Date: 6.07.2022
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MENU</title>
</head>
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: center;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
<body>

    <table>
        <tr>
            <th id="service-names">Service Name</th>
        </tr>
        <tr><td><a href="/nameForm">Name Form</a></td></tr>
        <tr><td><a href="/students/show-form">Student Form</a></td></tr>
        <tr><td><a href="/customers/show-form">Customer Form</a></td></tr>
    </table>

</body>
</html>
