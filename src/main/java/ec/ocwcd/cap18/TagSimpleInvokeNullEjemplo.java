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
public class TagSimpleInvokeNullEjemplo extends SimpleTagSupport implements SimpleTag {
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
            getJspBody().invoke(null);
            getJspBody().getJspContext().getOut().toString();
            //ANALOGO A  getJspBody().invoke(getJspContext().getOut());
            //PARA ACCEDER AL CUERPO DEL MENSAJE  StringWriter sw = new StringWriter();
            //getJspBody().invoke(sw); --SE PUEDE MANEJAR EL CONTENIDO DEL TEXTO
            //NO LLamar invoke No hace uso de JSPFRAGMENTS

        } catch (IOException e) {
            e.printStackTrace();
        }
        super.doTag();
    }
}
