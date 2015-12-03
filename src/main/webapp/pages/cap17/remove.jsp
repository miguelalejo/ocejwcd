<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="ec.ocwcd.cap16.Alumno" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Alumno alumno = new Alumno();
    alumno.setNombre("Pedro");
    request.setAttribute("alumno", alumno);
    session.setAttribute("alumnoSession",alumno);
%>
REQUEST ANTES: ${alumno.nombre}
<c:remove var="alumno"></c:remove>
<br>
REQUEST DESPUEST:${alumno.nombre}
<br>
SESION ANTES: ${alumnoSession.nombre}
<c:remove var="alumnoSession" scope="page"></c:remove>
<br>
SESION DESPUES: ${alumnoSession.nombre}
</body>
</html>
