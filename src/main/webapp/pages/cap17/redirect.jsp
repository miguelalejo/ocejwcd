<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 3/12/2015
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String parametro = request.getParameter("opcion");
    pageContext.setAttribute("parametro",parametro);
%>
VALOR PARAMETRO:${parametro}
<c:if test="${parametro=='LOCAL'}">
    INGRESO LOCAL
    <c:redirect url="./pagina prueba.jsp"></c:redirect>
</c:if>
<c:if test="${parametro=='EXTERNA'}">
    INGRESO EXTERNA
    <c:redirect url="/pages/pagina prueba.jsp" context="/webApp"></c:redirect>
</c:if>
</body>
</html>
