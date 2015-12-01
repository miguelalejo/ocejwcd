package ec.ocwcd.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.log4j.Logger;

public class ListenerParametro implements HttpSessionAttributeListener {

	private static Logger LOG = Logger.getLogger(ListenerParametro.class);
	public void attributeAdded(HttpSessionBindingEvent evento) {
		LOG.info(debugHttpSessionBindingEvent("Se agrego el atributo %s valor %s",evento));		
	}

	public void attributeRemoved(HttpSessionBindingEvent evento) {
		LOG.info(debugHttpSessionBindingEvent("Se elimino el atributo %s valor %s",evento));		
	}

	public void attributeReplaced(HttpSessionBindingEvent evento) {
		LOG.info(debugHttpSessionBindingEvent("Se modifico el atributo %s valor %s",evento));	
		
	}
	
	private String debugHttpSessionBindingEvent(String mensaje, HttpSessionBindingEvent evento){
		return String.format(mensaje,evento.getName(),evento.getValue());
	}

}
