<%@ page import="ec.ocwcd.cap16.Persona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 10/12/2015
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="lib" tagdir="/WEB-INF/tags/dirTagsCap19" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>AT_BEGIN</h1>
<c:set var="titulo" value="INICIO"/>
<br>ANTES DEL COMPONENTE : ${titulo}
<lib:directiveVariable_AT_BEGIN><br>EN BODY DEL COMPONENTE : ${titulo}</lib:directiveVariable_AT_BEGIN>
<br>DESPUES DEL COMPONENTE : ${titulo}

<h1>NESTED</h1>
<c:set var="titulo" value="INICIO"/>
<br>ANTES DEL COMPONENTE : ${titulo}
<lib:directiveVariable_NESTED><br>EN BODY DEL COMPONENTE : ${titulo}</lib:directiveVariable_NESTED>
<br>DESPUES DEL COMPONENTE : ${titulo}

<h1>AT_END</h1>
<c:set var="titulo" value="INICIO"/>
<br>ANTES DEL COMPONENTE : ${titulo}
<lib:directiveVariable_AT_END><br>EN BODY DEL COMPONENTE : ${titulo}</lib:directiveVariable_AT_END>
<br>DESPUES DEL COMPONENTE : ${titulo}

</body>
</html>
