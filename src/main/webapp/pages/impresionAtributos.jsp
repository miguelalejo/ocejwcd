<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String atributo1=(String) request.getAttribute("atributo1");
		String atributo2=(String) request.getAttribute("atributo2");
		String atributo3=(String) request.getAttribute("atributo3");
		out.println("ATRIBUTOS: ");
		out.println("atributo1:"+atributo1);
		out.println("atributo2:"+atributo2);
		out.println("atributo:"+atributo3);
		%>
</body>
</html>