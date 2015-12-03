<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 3/12/2015
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:import url="/pages/cap16/setpropertyall.jsp">
    <c:param name="nick" value="NICK"></c:param>
    <c:param name="password" value="PASS"></c:param>
    <c:param name="clavePrivada" value="TOKEN"></c:param>
    <c:param name="codigoArea" value="1000"></c:param>


</c:import>
</body>
</html>
