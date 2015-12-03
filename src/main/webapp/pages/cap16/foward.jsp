<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 1/12/2015
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:forward page="footer.jsp">
    <jsp:param name="nick" value="MICKE"/>
    <jsp:param name="password" value="SECRET"/>
</jsp:forward>

</body>
</html>
