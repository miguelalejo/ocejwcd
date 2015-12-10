<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 8/12/2015
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sim" uri="http://ocejwcd.ec/TagSimpleEjemplo" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>BODY EMPTY</h1>
    <sim:tagsimpleejemplo/>
    <br/>
    <h1>BODY SCRIPTLESS</h1>
    <sim:tagsimpleejemplocontent>CONTENIDO</sim:tagsimpleejemplocontent>
    <br/>
    <h1>BODY INVOKE</h1>
    <sim:tagsimpletablaejemplo dimension="2" palabra="TEXTO PRUEBA">CONTENIDO</sim:tagsimpletablaejemplo>
    <br>RESTO DEL CUERPO DE LA PAGINA
</body>
</html>
