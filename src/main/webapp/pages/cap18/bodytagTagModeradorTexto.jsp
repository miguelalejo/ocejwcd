<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 8/12/2015
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mod" uri="http://ocejwcd.ec/TagModeradorEjemplo" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>EVAL BODY BUFFERED</h1>
    <br>
    <mod:tagmoderadorejemplo token=","><br>CUERPO,MODERADOR,MALAS,PALABRAS,BASURA,SHEET,FUCK</mod:tagmoderadorejemplo>
    <br>
    <h1>EVAL BODY INCLUDE</h1>
    <br>
    <mod:tagmoderadorbodyejemplo ><br>CUERPO,MODERADOR,MALAS,PALABRAS,BASURA,SHEET,FUCK</mod:tagmoderadorbodyejemplo>
    <br>RESTO DEL CUERPO DE LA PAGINA
</body>
</html>
