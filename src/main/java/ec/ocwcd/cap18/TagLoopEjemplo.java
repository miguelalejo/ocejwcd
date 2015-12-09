package ec.ocwcd.cap18;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by Miguel on 8/12/2015.
 */
public class TagLoopEjemplo extends TagSupport implements IterationTag {
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public int doStartTag(){
        JspWriter jspWriter= pageContext.getOut();
        contador = 0;
        try {
            jspWriter.write("<br>START TAG");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag(){
        JspWriter jspWriter= pageContext.getOut();
        try {
            jspWriter.write("<br>END TAG");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }

    @Override
    public int doAfterBody(){
        JspWriter jspWriter= pageContext.getOut();
        try {
            jspWriter.write("<br>ITERACION NRO:"+contador );
        } catch (IOException e) {
            e.printStackTrace();
        }
        contador++;
        if(contador>4){
            return  SKIP_BODY;
        }


        return EVAL_BODY_AGAIN;
    }

}
