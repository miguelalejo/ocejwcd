package ec.ocwcd.cap18;

import ec.ocwcd.cap16.Persona;
import org.apache.log4j.Logger;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miguel on 9/12/2015.
 */
public class TagAtributoDinamico extends SimpleTagSupport implements DynamicAttributes {
    private static Logger LOG = Logger.getLogger(TagAtributoDinamico.class);
    Map<String, Object> listaAtributosDinamicos;
    Map<String, String> listaNameSpace;

    int dimension;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setDynamicAttribute(String ns, String name, Object value) {
        LOG.info(String.format("ns:%s,name:%s,valor:%s", ns, name, value));
        if (ns != null) {
            listaNameSpace.put(name, ns);
        }
        listaAtributosDinamicos.put(name, value);
    }

    @Override
    public void setJspContext(JspContext jspContext) {
        listaNameSpace = new HashMap<String, String>();
        listaAtributosDinamicos = new HashMap<String, Object>();
        super.setJspContext(jspContext);
    }

    @Override
    public void doTag() throws SkipPageException {
        Persona persona = (Persona) listaAtributosDinamicos.get("persona");
        String nombreTabla = (String) listaAtributosDinamicos.get("nombreTabla");
        if (persona == null || dimension == 0 || nombreTabla == null) {
            throw new SkipPageException("ERROR PARAMETROS NO VALIDOS");
        }
        Writer writer = getJspContext().getOut();

        try {
            getJspBody().invoke(null);
            writer.write("<table>");
            writer.write(String.format("<tr colspan='%s'><th>%s</th></tr>", dimension, nombreTabla));
            for (String atributo : listaAtributosDinamicos.keySet()) {
                writer.write("<tr>");
                for (int j = 0; j < dimension; j++) {
                    writer.write("<td>");
                    writer.write(atributo + "-" + listaAtributosDinamicos.get(atributo));
                    writer.write("</td>");
                }
                writer.write("</tr>");
            }
            for (String ns : listaNameSpace.keySet()) {
                writer.write("<tr>");
                for (int j = 0; j < dimension; j++) {
                    writer.write("<td>");
                    writer.write(ns + "-" + listaNameSpace.get(ns));
                    writer.write("</td>");
                }
                writer.write("</tr>");
            }
            writer.write("</table>");

        } catch (JspException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
