<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 10/12/2015
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="lib" tagdir="/WEB-INF/tags/dirTagsCap19" %>

<html>
<head>
    <title>Title</title>
</head>

<jsp:useBean id="persona" class="ec.ocwcd.cap16.Persona">CREAR PERSONA</jsp:useBean>
<jsp:setProperty name="persona" property="nombre" value="PEDRO"/>
<jsp:setProperty name="persona" property="edad" value="10"/>
<lib:directiveAttribute persona="${persona}"></lib:directiveAttribute>
<lib:directiveAttributeXML persona="${persona}"></lib:directiveAttributeXML>
</body>
</html>