<%@ page import="ec.ocwcd.cap16.Persona" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<jsp:useBean id="usuario" class="ec.ocwcd.cap16.Usuario" scope="request">
</jsp:useBean>
<jsp:setProperty name="usuario" property="*"></jsp:setProperty>
<jsp:setProperty name="usuario" property="token" value="TKPRUEBA"></jsp:setProperty>
<jsp:setProperty name="usuario" property="pk" param="clavePrivada"></jsp:setProperty>
<jsp:setProperty name="usuario" property="pk"></jsp:setProperty>
USUARIO:${usuario.nick}
PASSWORD:${usuario.password}
TOKEN:<jsp:getProperty name="usuario" property="token"></jsp:getProperty>
PK:${usuario.pk}
AREA:<jsp:getProperty name="usuario" property="codigoArea"></jsp:getProperty>
</body>
</html>