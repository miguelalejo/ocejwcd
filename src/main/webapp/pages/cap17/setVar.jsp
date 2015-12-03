<%@ page import="ec.ocwcd.cap16.Alumno" %>
<%@ page import="ec.ocwcd.cap16.Persona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Alumno alumno = new Alumno();
    alumno.setNombre("PEDRO");
    request.setAttribute("alumno",alumno);
    Persona persona2 = new Persona();
    persona2.setNombre("JUANITO P");
    request.setAttribute("persona2",persona2);

%>
<jsp:useBean id="persona" scope="page" beanName="ec.ocwcd.cap16.Persona" type="ec.ocwcd.cap16.IPersona"></jsp:useBean>
<jsp:setProperty name="persona" property="nombre" value="PEPE P"/>
ANTES SET:${alumno.nombre}
<c:set var="alumno" scope="request" value="LETRAS"/>
DESPUES SET:${alumno}

<c:set var="persona" scope="session" value="${persona}"/>
PERSONA SEESION: <% Persona p=(Persona)session.getAttribute("persona");%>
<%= p.getNombre()%>

<c:set var="persona" scope="session" value="${persona2}"/>
PERSONA DESPUES SET:<% Persona per2=(Persona)session.getAttribute("persona");%>
<%= per2.getNombre()%>
PERSONA EL es difernte debido a que EL toma el PRIMERO VALOR SCOPE: ${persona.nombre}

<c:set var="persona" scope="session">
    PERSONA STRING
</c:set>
PERSONA SET BODY:<%=session.getAttribute("persona")%>
</body>
</html>
