<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag import="ec.ocwcd.cap16.Persona" %>
<%@ variable name-given="persona" %>
<% Persona persona = new Persona();
    persona.setNombre("JOSE");
    persona.setEdad(50);
    request.setAttribute("persona",persona);

    Persona persona2 = new Persona();
    application.setAttribute("persona2",persona2);
%>
<%@ attribute name="titulo" rtexprvalue="false" required="true" type="java.lang.String" %>
<%@ variable name-from-attribute="titulo" alias="tit" %>
<c:set var="tit" value="PERSONA"/>
<%@ attribute name="personaObjetc" rtexprvalue="false" required="true" type="java.lang.String" %>
<%@ variable name-from-attribute="personaObjetc" alias="per" variable-class="ec.ocwcd.cap16.Persona" scope="AT_BEGIN" %>
<c:set var="per" value="${persona2}"/>
<jsp:setProperty name="per" property="nombre" value="SANTI"></jsp:setProperty>
<jsp:setProperty  name="per" property="edad" value="100"></jsp:setProperty>



<jsp:doBody/>
