<%@ page import="ec.ocwcd.cap16.Persona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 10/12/2015
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="lib" tagdir="/WEB-INF/tags/dirTagsCap19" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<lib:directiveVariable titulo="titulo" personaObjetc="personaObjeto"> <br/>${titulo}: <br/> ${persona} <br/>${titulo}:<br/>${personaObjeto}</lib:directiveVariable>
<br/>
RESTO DE LA PAGINA
<br/>
<% Persona per= (Persona)request.getAttribute("persona");%>
<!--Buscara la varable en el CONTEXTO QUE FUE DECLARADO DENTRO DE LA DIRECTIVA-->
<%= per.getNombre()%>
<br/>
<% Persona per2= (Persona)application.getAttribute("persona2");%>
<!--Buscara la varable en el CONTEXTO QUE FUE DECLARADO DENTRO DE LA DIRECTIVA-->
<%= per2.getNombre()%>

</body>
</html>
