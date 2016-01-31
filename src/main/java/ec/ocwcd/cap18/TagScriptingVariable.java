package ec.ocwcd.cap18;

import org.apache.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by Miguel on 10/12/2015.
 */
public class TagScriptingVariable extends TagSupport {

    static final Logger LOG = Logger.getLogger(TagScriptingVariable.class);
    Object value;
    String scope;
    String type;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }




    @Override
    public int doStartTag(){
        try {
            boolean existeContexto=false;
            boolean evaluarCuerpo = false;
            boolean esInterfaceObjeto = false;
            Class<?> claseObjeto = Class.forName(type);
            LOG.info(claseObjeto.toString());
            LOG.info(claseObjeto.isInterface());
            if(claseObjeto.isInterface()){
                Class<?> [] listaInterfaces = value.getClass().getInterfaces();
                for(Class<?> interfaceObjeto:listaInterfaces){
                    LOG.info(interfaceObjeto.toString());
                    if(claseObjeto==interfaceObjeto){
                        esInterfaceObjeto = true;
                        break;
                    }
                }
                if(esInterfaceObjeto==false){
                    throw new JspException("El tipo de clase no coincide con el objeto ");
                }

            }else {
                if (value!=null && !claseObjeto.isInstance(value)) {
                    throw new JspException("El tipo de clase no coincide con el objeto ");
                }
            }
            if(value==null){
                value = claseObjeto.newInstance();
                evaluarCuerpo = true;
            }
            if(scope=="page" || scope ==null){
                pageContext.setAttribute(id,value);
                existeContexto = true;
            }
            if(scope=="request"){
                pageContext.getRequest().setAttribute(id,value);
                existeContexto = true;
            }
            if(scope=="session"){
                pageContext.getSession().setAttribute(id,value);
                existeContexto = true;
            }
            if(scope=="application"){
                pageContext.getServletContext().setAttribute(id,value);
                existeContexto = true;
            }
            if(!existeContexto){
                throw new JspException("No existe el contexto");
            }
            if(evaluarCuerpo){
                return EVAL_BODY_INCLUDE;
            }
            return  SKIP_BODY;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        } catch (JspException e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        } catch (InstantiationException e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        }
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        value = null;
        scope = null;
        id = null;
        type = null;
        //Si no se inicializa nuevamente los valores quedan cargado en el CONTXTO del Manejador
        return super.doEndTag();
    }
}
