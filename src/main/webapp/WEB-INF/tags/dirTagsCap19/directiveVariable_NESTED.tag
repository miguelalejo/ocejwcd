<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag import="ec.ocwcd.cap16.Persona" %>
<%@ variable name-given="titulo" scope="NESTED" %>
<c:set var="titulo" value="COMPONENTE CUERPO"/>
<br>ANTES DEL CUERPO: ${titulo}
<jsp:doBody/>
<c:set var="titulo" value="DESPUES COMPONENTE CUERPO"/>
<br>DESPUES DEL CUERPO: ${titulo}