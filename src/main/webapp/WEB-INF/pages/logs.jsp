<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>files have founded:${quantity}</p>
<table border="1">
    <c:forEach items="${log_list}" var="log">

        <th>File Name</th>
        <tr>
            <td>
                <form method="get" action="/getText">
                <input type="submit" name="path" value=${log.path} >

                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
