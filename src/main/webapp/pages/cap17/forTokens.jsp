<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<c:forTokens items="A:A:A:" delims=":">
    <br>SALUDOS
</c:forTokens>
<br>
<c:forTokens items="HOLA:;COMO:;ESTAS:;" delims=":;" var="palabra">
    <br>${palabra}
</c:forTokens>
<c:forTokens items="ESTA%ES%UNA%FRASE%MUY%MUY%MUY%LARGA" delims="%" var="palabra" begin="3" end="30" varStatus="estado">
    <br>${palabra} - ${estado.current} -${estado.last}
</c:forTokens>
<br>
<c:forTokens items="ESTA%ES%UNA%FRASE%MUY%MUY%MUY%LARGA" delims="%" var="palabra" begin="2" step="2" end="6" varStatus="estado">
    <br>${palabra} - ${estado.current} -${estado.last}
</c:forTokens>
<c:forTokens items="ESTA%ES%UNA%FRASE%MUY%MUY%MUY%LARGA" delims="%" var="palabra" begin="1" step="3" end="7" varStatus="estado">
    <br>${palabra} - ${estado.current} -${estado.last}
</c:forTokens>

</body>
</html>
