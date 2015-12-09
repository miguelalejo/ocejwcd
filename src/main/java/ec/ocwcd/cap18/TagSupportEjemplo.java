package ec.ocwcd.cap18;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by Miguel on 8/12/2015.
 */
public class TagSupportEjemplo extends TagSupport implements  Tag {
    private String id;
    private String nombre;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setPageContext(PageContext pageContext){
        JspWriter jspWriter=pageContext.getOut();
        try {
            jspWriter.write("<br/>INICIAL CARGA PAGE CONTEXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setPageContext(pageContext);
    }

    @Override
    public void setParent(Tag tag){
        JspWriter jspWriter=pageContext.getOut();
        try {
            jspWriter.write("<br/>INICIA LA EJECUCION SET PARENT");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setParent(tag);
    }
    @Override
    public int doStartTag() throws JspException {
        JspWriter jspWriter = pageContext.getOut();
        try {
            jspWriter.write("<br/>CONTENIDO JSP START TAG");
            jspWriter.write(String.format("<br>ATRIBUTOS: %s - %s",id,nombre));
        } catch (IOException e) {
           throw new JspException(e.getMessage());
        }
        return EVAL_BODY_INCLUDE;
    }
    @Override
    public int doEndTag() throws JspException {
        JspWriter jspWriter = pageContext.getOut();
        try {
            jspWriter.write("<br/>COTENIDO JSP END TAG ");
        } catch (IOException e) {
            throw new JspException(e.getMessage());
        }
        return EVAL_PAGE;
    }
}
