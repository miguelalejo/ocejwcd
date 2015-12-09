<%@ tag import="java.util.Calendar" %>
<%@ tag import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ attribute name="tipo" required="true" %>

<jsp:useBean id="fecha" class="java.util.Date" scope="page"/>
<jsp:useBean id="fechaEnvio" class="java.util.Date" scope="page"/>
<c:choose>
    <c:when test="${tipo == 'RAPIDO'}" >
        <c:set var="dias" value="2" scope="page"/>
    </c:when>
    <c:when test="${tipo == 'NORMAL'}">
        <c:set var="dias" value="5" scope="page"/>
    </c:when>
</c:choose>
<jsp:setProperty name="fechaEnvio" property="time" value="${fecha.time +  86400000 *dias}"></jsp:setProperty>
 EL-<fmt:formatDate value="${fechaEnvio}" type="date"
                dateStyle="full"/>.<br><br>