<%@ tag import="ec.ocwcd.cap16.Usuario" %>
<%@ tag import="ec.ocwcd.cap16.IPersona" %>
<%@ tag pageEncoding="US-ASCII" %>
<%@ attribute name="persona" required="true" fragment="false" rtexprvalue="true" type="ec.ocwcd.cap16.Persona"
              description="Descripcion" %>

<br/>PER:<%=persona.getNombre()%>
