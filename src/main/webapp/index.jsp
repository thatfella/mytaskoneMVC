<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Number Input</title>
</head>
<body>
<!--WEB-INF/views-->
<form action="${pageContext.request.contextPath}/ch/">
    Input your number here:
    <input type="text" name="number"/>
    <input  type="submit" >
</form>

</body>
</html>
