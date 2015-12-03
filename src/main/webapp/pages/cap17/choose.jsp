<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("valor" ,"valor");%>
<c:choose>
    <c:when test="${1==1}">
        1 es IGUAL A UNO
    </c:when>
    <c:when test="${2==3}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:when test="${valor.equals('valor')}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:otherwise>
        NO IMPRIME ESTA LINEA
    </c:otherwise>
</c:choose>
<br>
<c:choose>
    <c:when test="${1!=1}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:when test="${2==3}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:when test="${!valor.equals('valor')}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:otherwise>
        NINGUNA
    </c:otherwise>
</c:choose>
<br>
<c:choose>
    <c:when test="${1!=1}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:when test="${2==3}">
        NO IMPRIME ESTA LINEA
    </c:when>
    <c:when test="${valor.equals('valor')}">
        VALOR == VALOR
    </c:when>
    <c:otherwise>
        NO IMPRIME ESTA LINEA
    </c:otherwise>
</c:choose>

</body>
</html>
