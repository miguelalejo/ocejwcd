package ec.ocwcd.cap18;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 9/12/2015.
 */
public class TagSimpleEjemplo extends SimpleTagSupport implements SimpleTag {
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
        JspWriter jspWriter = getJspContext().getOut();
        try {
            jspWriter.write("<br>INICIA JSP BODY");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.doTag();
    }
}
