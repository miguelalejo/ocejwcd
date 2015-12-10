<%@ page import="ec.ocwcd.cap16.Persona" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 8/12/2015
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="din" uri="/WEB-INF/tagdynamicattribute.tld" %>
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
    <din:tagdynamicattibute dimension="2" nombreTabla="TABLA PERSONA" persona="${persona}" >
        <jsp:attribute name="tipoSangre">
            B+
        </jsp:attribute>
        <jsp:attribute name="genero">
            MASCULINO
        </jsp:attribute>
        <jsp:body>
            SIN ESPACION NO FUNCIONA
        </jsp:body>
    </din:tagdynamicattibute>
   <br>RESTO DEL CUERPO DE LA PAGINA
</body>
</html>
