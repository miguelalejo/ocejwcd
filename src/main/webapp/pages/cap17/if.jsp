<%@ page import="ec.ocwcd.cap16.Persona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${2>3}" var="res" />
<c:if test="1=1" var="comp">
    HOLA 1=1
</c:if>
COMP:${comp}
<br>
<c:if test="${1==1}">
    HOLA 1==1
</c:if>
<br>
<c:if test="${1!=2}">
    HOLA 1==2
</c:if>
<br>
<c:if test="${empty null}">
    HOLA ES NULO
</c:if>
<%
    request.setAttribute("verdadero",true);
%>
<br>
<c:if test="${verdadero}">
    HOLA ES BOLEANO
</c:if>
<br>
<c:if test="${2<3}" var="comparar" scope="session">
    ES 2 < 3 : ${comparar}
</c:if>
<br>
COMPARAR REQUEST:<%= request.getAttribute("comparar")%>
<br>
COMPARAR SESSION:<%= session.getAttribute("comparar")%>
<br>
<%
    Persona persona = new Persona();
    persona.setEdad(20);
    persona.setNombre("LUIS");
    request.setAttribute("persona",persona);
%>
<br>
<c:if test="${persona.nombre=='LUIS'}" var="resultado">
    SU NOMBRE ES LUIS
</c:if>
<br>
</body>
</html>
