<%@ page import="java.io.Reader" %>
<%@ page import="java.io.Writer" %><%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 3/12/2015
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:import url="/pages/pagina prueba.jsp" context="/webApp" varReader="reader" >
    <% Reader lector = (Reader) pageContext.getAttribute("reader");
        Writer writer= response.getWriter();
        int dato = 0;
        while((dato=lector.read())!=-1){

                writer.write("-");
                writer.write(dato);


        }
        writer.flush();
        writer.close();
    %>
</c:import>

</body>
</html>
