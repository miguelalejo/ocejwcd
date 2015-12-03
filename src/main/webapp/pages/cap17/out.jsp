<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 2/12/2015
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("nombre","su nombre es:<Miguel>");
    request.setAttribute("nulo",null);
%>
<%!
    public String obtenerNombre(){
        return "JOSE";
    }
%>
<c:out value="valueMandatorio"/>
<br>
<c:out value="saludo" escapeXml="false" default="vacio"/>
<br>
<c:out value="saludo<Miguel>" escapeXml="false" default="vacio">
</c:out>
<br>
<c:out value="saludo<Miguel>" escapeXml="true" default="vacio">
</c:out>
<br>
<c:out value="${nombre}" escapeXml="true" default="vacio"></c:out>
<br>
<c:out value="${nulo}" escapeXml="true" default="vacio"></c:out>
<br>
<c:out value="${null}" escapeXml="true" default="vacio"></c:out>
<br>
<c:out value="<%=obtenerNombre()%>" escapeXml="true" default="vacio"></c:out>
</body>
</html>
