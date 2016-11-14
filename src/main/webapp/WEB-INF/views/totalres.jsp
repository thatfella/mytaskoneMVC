<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Check number</title>
</head>
<body>
Results for your number styled in green :=) ${num}<br>

<table border="5" align="left" bgcolor="#32cd32" >
    <c:forEach var="entry" items="${checked}">
        <tr>
        <td>Number <c:out value="${entry.value}"/></td><td> <c:out value="${entry.key}"/></></td>
        </tr>
            </c:forEach>
</table>



</body>
</html>
