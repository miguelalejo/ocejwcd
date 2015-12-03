<%@ page import="ec.ocwcd.cap16.Persona" %>
<%@ page import="ec.ocwcd.cap16.Usuario" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Persona persona = new Persona();
    persona.setNombre("JOSE");

    request.setAttribute("persona",persona);

    Map<String,Usuario> listaUsuarios = new HashMap<String,Usuario>();
    Usuario a = new Usuario();
    a.setNick("A");
    Usuario b = new Usuario();
    b.setNick("B");
    listaUsuarios.put("a",a);
    listaUsuarios.put("b",b);
    session.setAttribute("usuarios",listaUsuarios);
    Usuario usuario = new Usuario();
    usuario.setNick("USER");
    application.setAttribute("usuario",usuario);

%>
ANTES SET:${persona.nombre}
<br>
<c:set target="${persona}" property="nombre" value="PERDRITO"></c:set>
DESPUES SET: ${persona.nombre}

<jsp:useBean id="alumno" class="ec.ocwcd.cap16.Alumno" scope="request"/>
<c:set target="${alumno}" property="nombre" value="JOSESITO"/>
<br>
DESPUES SET: ${alumno.nombre}
<br>
Usuario A ANTES:${usuarios.a.nick}
<br>
<c:set target="${usuarios}" property="a" value="CADENA1"></c:set>
Usuario A DESPUES:${usuarios.a}
<br>

<c:set target="${usuarios}" property="c" value="CADENA3"></c:set>
<br>
Usuario B ANTES:${usuarios.b.nick}
<c:set target="${usuarios}" property="b">
    CADENA 2
</c:set>
<br>
Usuario B DESPUES:${usuarios.b}
<br>
Usuario C ANTES:${usuarios.c}
<c:set target="${usuarios}" property="c" value="${usuario}"/>
<br>
Usuario C DESPUES:${usuarios.c.nick}
</body>
</html>
