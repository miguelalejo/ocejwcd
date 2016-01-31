<jsp:directive.tag import="ec.ocwcd.cap16.Persona"></jsp:directive.tag>
<jsp:directive.attribute name="persona" fragment="false" rtexprvalue="true" type="ec.ocwcd.cap16.Persona"></jsp:directive.attribute>
PERSONA XML:${persona.nombre}
<br/>
<jsp:scriptlet>out.println(jspContext.getAttribute("persona"));</jsp:scriptlet>
<br/>
<jsp:scriptlet>Persona per=(Persona)jspContext.getAttribute("persona");
                out.println("NOMBRE:"+per.getNombre());</jsp:scriptlet>
