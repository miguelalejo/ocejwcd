package ec.ocwcd.cap18;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by Miguel on 9/12/2015.
 */
public class TagSimpleTablaEjemplo extends SimpleTagSupport implements SimpleTag {
    private int dimension;
    private String palabra;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void setJspContext(JspContext jspContext){
        Writer writer= jspContext.getOut();
        try {
            writer.write("<br>INICIA JSP CONTEXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setJspContext(jspContext);
    }

    @Override
    public void setParent(JspTag tag){
        Writer writer = getJspContext().getOut();
        try {
            writer.write("<br>INICIA SET PARETN");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setParent(tag);
    }

    @Override
    public void setJspBody(JspFragment jspFragment){
        Writer writer = getJspContext().getOut();
        try {
            writer.write("<br>INICIA JSP BODY");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setJspBody(jspFragment);
    }

    @Override
    public void doTag() throws IOException, JspException {
        Writer writer = getJspContext().getOut();
        try {
            writer.write("<br>INICIA DO TAG");
            if(dimension==0){
                throw new SkipPageException("Error numero no valido");
            }
            writer.write("<table border=\"1\" style=\"width:100%\">");
            StringWriter sw = new StringWriter();
            getJspBody().invoke(sw);
            writer.write(String.format("<tr><th colspan='%s'>%s</th></tr>",dimension,sw.toString()));
            for(int i=0;i<dimension;i++){
                writer.write("<tr>");
                for(int j=0;j<dimension;j++){
                    writer.write("<td>");
                    writer.write(palabra);
                    writer.write("</td>");
                }
                writer.write("</tr>");
            }
            writer.write("</table>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.doTag();
    }
}
