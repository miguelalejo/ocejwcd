<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 3/12/2015
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<c:url value='pagina prueba.jsp'></c:url>">PAGINA PRUEBA SIN SLASH</a>
<a href="<c:url value='./pagina prueba.jsp'></c:url>">PAGINA PRUEBA</a>
<a href="<c:url value='/pagina prueba.jsp' context="/"></c:url>">PAGINA PRUEBA CONTEXTO</a>
<a href="<c:url value='/pages/login.jsp' context='/webApp'></c:url>">LOGIN CONTEXTO WEB APP</a>
<%--<a href="<c:url value='pages/login.jsp' context='/webApp'></c:url>">LOGIN CONTEXTO SIN SLASH WEB APP</a>--%>
<a href="<c:url value='/login.jsp' context='/webApp/pages'></c:url>">LOGIN CONTEXTO PAGINA WEB APP</a>

<c:url value='/pages/pagina prueba.jsp' context='/webApp' scope='request' var='valorPagina'></c:url>
<a href="${valorPagina}">PAGINA PRUEBA CONTEXTO WEB APP</a>


</body>
</html>
