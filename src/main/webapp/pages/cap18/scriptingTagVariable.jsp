<%@ page import="ec.ocwcd.cap16.Persona" %>
<%@ page import="ec.ocwcd.cap16.IPersona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 8/12/2015
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="scr" uri="http://ocejwcd.ec/TagScriptingVariable" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% Persona persona = new Persona();
    persona.setNombre("MIGUEL");
    persona.setEdad(29);
    pageContext.setAttribute("persona", persona);
%>
<h1>PERSONA</h1>
<scr:scriptingvariable id="persona" scope="request" type="ec.ocwcd.cap16.Persona" value="${persona}">
    PERSONA-CUERPO
</scr:scriptingvariable>
<%= ((Persona) request.getAttribute("persona")).getNombre()%>
<h1>INTERFACE</h1>
<scr:scriptingvariable id="persona2" scope="session" type="ec.ocwcd.cap16.IPersona" value="${persona}">
    PERSONA-CUERPO
</scr:scriptingvariable>
<%= ((IPersona) session.getAttribute("persona2")).getEdad()%>
<h1>INTERFACE</h1>
<scr:scriptingvariable id="persona3" scope="request" type="ec.ocwcd.cap16.Persona">
    PERSONA-CUERPO
</scr:scriptingvariable>
<%= ((Persona) request.getAttribute("persona3")).getNombre()%>
<h1>PERSONA-SET-SCRPTLET</h1>
<scr:scriptingvariable id="persona4" scope="page" type="ec.ocwcd.cap16.Persona">
    PERSONA-CUERPO
</scr:scriptingvariable>
<% Persona p = (Persona) pageContext.getAttribute("persona4");
    p.setNombre("PETER");
%>
<%= ((Persona) pageContext.getAttribute("persona4")).getNombre()%>
<h1>PERSONA-JSP-SET</h1>
<scr:scriptingvariable id="persona5" scope="application" type="ec.ocwcd.cap16.Persona">
    PERSONA-CUERPO
</scr:scriptingvariable>
<jsp:setProperty name="persona5" property="nombre" value="PEDRITO"></jsp:setProperty>
<%= ((Persona) application.getAttribute("persona5")).getNombre()%>
<br>RESTO DEL CUERPO DE LA PAGINA
</body>
</html>
