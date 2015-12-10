<%@ page import="ec.ocwcd.cap16.Persona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 8/12/2015
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="per" uri="persona" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>TAG SET PERSONA</h1>
    <% Persona persona=new Persona();
        persona.setNombre("MIGUEL");
        persona.setEdad(29);
        pageContext.setAttribute("persona",persona);
    %>
   <br>
    <per:tagsetpersona persona="${persona}" ><br/>CONTENIDO PERSONA</per:tagsetpersona>
    <br>
    <h1>TAG SET PERSONA</h1>
    <jsp:useBean id="persona2" class="ec.ocwcd.cap16.Persona" scope="page" />
    <jsp:setProperty name="persona2" property="nombre" value="PEDRO"/>
    <jsp:setProperty name="persona2" property="edad" value="80"/>

    <per:tagsetpersona persona="${persona2}" ><br/>CONTENIDO PERSONA2</per:tagsetpersona>


    <br>RESTO DEL CUERPO DE LA PAGINA
</body>
</html>
