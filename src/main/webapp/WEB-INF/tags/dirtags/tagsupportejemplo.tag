<%@ tag import="java.util.Calendar" %>
<%@ tag import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ attribute name="tipo" required="true" %>

<jsp:useBean id="fecha" class="java.util.Date" scope="request"/>

<c:choose>
    <c:when test="${tipo == 'RAPIDO'}">
        <c:set var="dias" value="2" scope="request" />
    </c:when>
    <c:when test="${tipo == 'NORMAL'}">
        <c:set var="dias" value="5"  scope="request" />
    </c:when>
</c:choose>
<% Calendar calendario = Calendar.getInstance();
    calendario.setTime((Date)request.getAttribute("fecha"));
    calendario.add(Calendar.DAY_OF_MONTH, Integer.valueOf((String)request.getAttribute("dias")));
    request.setAttribute("fechaEnvio",calendario.getTime());

%>

SC-<fmt:formatDate value="${fechaEnvio}" type="date"
                dateStyle="full"/>.<br><br>