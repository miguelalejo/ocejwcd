<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:catch>
    <% int a= 10/0; %>
    <%= "Se imprime el texto 1" %>
</c:catch>
<c:catch var="manejadorError">
    <% int a=10/0; %>
    <%= "Se imprime el texto 2" %>
</c:catch>
MENSAJE DE ERROR:${manejadorError.message}
</body>
</html>
