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
public class TagModeradorEjemplo  extends BodyTagSupport implements  BodyTag {

    private static final String[] PALABROTAS={"BASURA","SHEET","FUCK"};
    private static final String[] PALABRAS_DELIMITADAS={"B****A","S***T","F**K"};
    private String token;
    private String[] texto;
    private int contador;
    String cuerpoMensaje;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

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
        return EVAL_BODY_BUFFERED;
    }

    @Override
    public void setBodyContent(BodyContent bodyContent){
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>PROCESO BODY CONTENT");
            bodyContent.write("<br> TOKEN:"+token);
            bodyContent.clearBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setBodyContent(bodyContent);
    }

    @Override
    public void doInitBody() throws JspException {
        JspWriter writer = pageContext.getOut();
        try {
            writer.write("<br/>PROCESO INIT BODY");
            BodyContent bc = getBodyContent();
            JspWriter jspWriter =  bc.getEnclosingWriter();
            jspWriter.write("<br/>JSP INIT BODY");
            jspWriter.write("<br/>CUERPO INIT BODY"+bc.getString());
            bc.writeOut(jspWriter);
            bodyContent.clearBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int doAfterBody(){
        JspWriter writer = pageContext.getOut();
        JspWriter jspWriter =null;
        BodyContent bc=null;
        try {
            bc = getBodyContent();
            jspWriter = bc.getEnclosingWriter();
            cuerpoMensaje = bc.getString();
            if(contador==0){
                texto = cuerpoMensaje.split(token);
                jspWriter.write(cuerpoMensaje);
            }
            if(cuerpoMensaje.isEmpty()){
                return SKIP_BODY;
            }
            else {
                if (contador < texto.length) {
                    jspWriter.write("<br/>JSP AFTER BODY BODY - ");
                    String palabra= texto[contador];
                    int contadorPalabras =0;
                    for(String palabrota:PALABROTAS){
                        if(palabra.equalsIgnoreCase(palabrota)){
                            palabra = PALABRAS_DELIMITADAS[contadorPalabras];
                        }
                        contadorPalabras++;
                    }
                    jspWriter.write(palabra);
                    this.contador++;
                    return EVAL_BODY_AGAIN;
                } else {
                    return SKIP_BODY;
                }
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
            writer.write("<br/>PROCESO END TAG");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }
}
