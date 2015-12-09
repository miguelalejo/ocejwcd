<%@ tag import="java.util.Calendar" %>
<%@ tag import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ attribute name="tipo" required="true" %>

<jsp:useBean id="fecha" class="java.util.Date" scope="page"/>

<c:choose>
    <c:when test="${tipo == 'RAPIDO'}" >
        <c:set var="dias" value="2" scope="page"/>
    </c:when>
    <c:when test="${tipo == 'NORMAL'}">
        <c:set var="dias" value="5" scope="page"/>
    </c:when>
</c:choose>
<%
    Calendar calendario = Calendar.getInstance();
    calendario.setTime((Date)pageContext.getAttribute("fecha"));
    calendario.add(Calendar.DAY_OF_MONTH, Integer.valueOf((String)pageContext.getAttribute("dias")));
    pageContext.setAttribute("fechaEnvio",calendario.getTime());

%>

<fmt:formatDate value="${fechaEnvio}" type="date"
                dateStyle="full"/>.<br><br>