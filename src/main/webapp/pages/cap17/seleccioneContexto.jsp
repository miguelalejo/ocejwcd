<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 3/12/2015
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="redirect.jsp" method="post">
    SELECCIONE UNA OPCION
    <select name="opcion">
        <option value="LOCAL" name="local">LOCAL</option>
        <option value="EXTERNA" name="externa">EXTERNA</option>
    </select>
    <br>
    <input type="submit" value="ENVIAR">
</form>

</body>
</html>
