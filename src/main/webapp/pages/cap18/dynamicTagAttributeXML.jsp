<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
          xmlns:din="http://ocejwcd.ec/TagAtributoDinamico"
          version="1.2"
>
    <jsp:directive.page contentType="text/html"/>
    <html xmlns="http://www.w3c.org/1999/xhtml" xmlns:c="http://java.sun.com/jsp/jstl/core">
    <head><title>Hello</title></head>
    <body>
    <jsp:useBean id="persona" class="ec.ocwcd.cap16.Persona"
                 scope="page"></jsp:useBean>
    <jsp:setProperty name="persona" property="nombre"
                     value="PEDRO"></jsp:setProperty>
    <jsp:setProperty name="persona" property="edad"
                     value="15"></jsp:setProperty>
    <c:url value='../cap17/pagina prueba.jsp' var="ruta" scope="page"></c:url>
    <din:tagdynamicattribute dimension="2" nombreTabla="TABLA PERSONA" persona='${persona}'>

        <jsp:attribute name="tipoSangre">B+</jsp:attribute>
        <jsp:attribute name="genero">MASCULINO</jsp:attribute>
        <jsp:attribute name="url">
        <a href="${ruta}">PAGINA PRUEBA SIN SLASH</a>
        </jsp:attribute>


        <jsp:body>
            SIN ESPACION NO FUNCIONA
        </jsp:body>

    </din:tagdynamicattribute>
    <br>RESTO DEL CUERPO DE LA PAGINA</br>
    </body>
    </html>


</jsp:root>