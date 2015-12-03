<%@ page import="ec.ocwcd.cap16.Alumno" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="1" end="10">
    HOLA
</c:forEach>
<br>
<c:forEach begin="1" end="10" step="4">
    SALUDO
</c:forEach>
<br>
<c:forEach begin="1" end="5" var="contador">
    ITERAR: ${contador}
</c:forEach>
<br>
<c:forEach begin="1" end="5" var="contador" varStatus="estado">
    ITERAR NUEVO: <%= (Integer)pageContext.findAttribute("contador")%> - ${estado.current} - ${estado.last}
</c:forEach>

<%
    List<Alumno> listaAlumnos = new ArrayList<Alumno>();
    Alumno a=new Alumno();
    a.setNombre("JOSE");
    Alumno b=new Alumno();
    b.setNombre("JHANET");
    Alumno c=new Alumno();
    c.setNombre("FAUSTO");
    Alumno d=new Alumno();
    d.setNombre("JOSESITO");
    Alumno e=new Alumno();
    e.setNombre("DIEGO");
    listaAlumnos.add(a);
    listaAlumnos.add(b);
    listaAlumnos.add(c);
    listaAlumnos.add(d);
    listaAlumnos.add(e);
    request.setAttribute("listaAlumnos",listaAlumnos);
%>
<br>
LISTA ALUMOS
<c:forEach items="${listaAlumnos}" var="alumno" varStatus="estado">
    <br>${alumno.nombre}-${estado.begin}-${estado.last}-${estado.current.nombre}-${estado.step}
</c:forEach>
<br>
LISTA ALUMOS CONTADO
<c:forEach items="${listaAlumnos}" var="alumno" varStatus="estado" begin="2" end="100" step="2">
    <br>${alumno.nombre}-${estado.begin}-${estado.last}-${estado.current.nombre}-${estado.step}
</c:forEach>
<br>
<% Map<String,String> mapaCiudades=new HashMap<String,String>();
    mapaCiudades.put("UIO","QUITO");
    mapaCiudades.put("GYE","GUAYAQUIL");
    mapaCiudades.put("LOH","LOJA");
    mapaCiudades.put("CUE","CUENCA");
    pageContext.setAttribute("mapaCiudades",mapaCiudades);
    String cadena="HOLA SALUDOS";
    session.setAttribute("cadena",cadena);
%>

LISTA CIUDADES
<c:forEach items="${mapaCiudades}" varStatus="estado" var="clave">
   <br> ${clave}-${estado.current}
</c:forEach>

RECORRER CADENA
<br>
<c:forEach items="HOLA COMO ESTAS" var="caracter">
    ${caracter}-
</c:forEach>
<br>
RECORRER CADENA
<br>
<c:forEach items="${cadena}" var="caracter">
    ${caracter}-
</c:forEach>
${caracter}
</body>
</html>
