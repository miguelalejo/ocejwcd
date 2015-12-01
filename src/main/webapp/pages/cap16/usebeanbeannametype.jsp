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
<%
    Persona persona = new Persona();
    session.setAttribute("personaSession", persona);
    persona.setEdad(50);
    persona.setNombre("Jose");
%>
<jsp:useBean id="personaApplication" beanName="ec.ocwcd.cap16.Persona" type="ec.ocwcd.cap16.IPersona" scope="application">
    saludo Application
</jsp:useBean>

<jsp:useBean id="personaSession" beanName="ec.ocwcd.cap16.Persona" type="ec.ocwcd.cap16.Persona" scope="session">
    saludo Session NO se INICIA Porque ya existe el objeto
</jsp:useBean>
<%= personaSession.getEdad()%>
<%= personaSession.getNombre()%>



</body>
</html>