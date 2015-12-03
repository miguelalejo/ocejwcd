<%--
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
PIE DE PAGINA
<jsp:useBean id="usuario" beanName="ec.ocwcd.cap16.Usuario" type="ec.ocwcd.cap16.Usuario"></jsp:useBean>
<jsp:setProperty name="usuario" property="*"></jsp:setProperty>
NICK:<jsp:getProperty name="usuario" property="nick"></jsp:getProperty>
PASS:<jsp:getProperty name="usuario" property="password"></jsp:getProperty>
<jsp:useBean id="fecha" class="java.util.Date" scope="request" ></jsp:useBean>
FECHA:${fecha}

</body>
</html>
