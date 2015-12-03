<%@ page import="java.util.Calendar,java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 1/12/2015
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Calendar calendar= Calendar.getInstance();
    calendar.add(Calendar.MONTH,3);
Date fechaActual=calendar.getTime();
request.setAttribute("fecha",fechaActual);%>
<jsp:include page="footer.jsp" flush="true">
    <jsp:param name="nick" value="PRUEBA"></jsp:param>
    <jsp:param name="password" value="NUEVA"></jsp:param>
    <jsp:param name="fecha" value="${fecha}"></jsp:param>
</jsp:include>
</body>
</html>
