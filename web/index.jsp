<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 22.07.2022
  Time: 3:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/home" method="get">
        <label>
            FULL NAME:
        </label>
        <input type="text" name="user_fullName"> <br><br>
        <label>
            EXAM POINTS:
        </label>
        <input type="number" name="user_examPoints"> <br><br>
        <button>SUBMIT EXAM</button>
    </form>

</body>
</html>
