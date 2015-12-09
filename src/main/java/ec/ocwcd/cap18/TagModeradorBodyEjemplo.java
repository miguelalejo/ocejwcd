package ec.ocwcd.cap18;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;
import java.io.IOException;

/**
 * Created by Miguel on 8/12/2015.
 */
public class TagModeradorBodyEjemplo extends BodyTagSupport implements  BodyTag {

    private int contador;

    @Override
    public void setPageContext(PageContext pageContext){
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>INICIA PAGE CONTEXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setPageContext(pageContext);
    }

    @Override
    public void setParent(Tag tag){
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>INICIA PARENT");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setParent(tag);
    }

    @Override
    public int doStartTag(){
        contador=0;
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>PROCESO START TAG");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_BODY_INCLUDE;
    }



    @Override
    public int doAfterBody(){
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>PROCESO AFTER BODY");
            if(contador<10)
            {
                this.contador++;
                return EVAL_BODY_AGAIN;
            }
            else{
                return SKIP_BODY;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return SKIP_BODY;
        }
    }

    @Override
    public int doEndTag(){
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>PROCESO DO END TAG");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }
}
