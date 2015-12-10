package ec.ocwcd.cap18;

import ec.ocwcd.cap16.Persona;

import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 9/12/2015.
 */
public class TagSetPersona extends TagSupport implements IterationTag {
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    @Override
    public int doStartTag(){
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody(){
        Writer writer=pageContext.getOut();
        try {
            writer.write("<br/>"+persona.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }


}
