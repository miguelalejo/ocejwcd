package ec.ocwcd.cap5;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

import org.apache.log4j.Logger;

public class ServletRequestWebAttributeListener implements
		ServletRequestAttributeListener {

	private static final Logger LOG = Logger
			.getLogger(ServletRequestWebAttributeListener.class);
	public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		LOG.info("SE AGREGA ATRIBUTO");
		LOG.info(servletRequestAttributeEvent.getName());
		LOG.info(servletRequestAttributeEvent.getValue());
		
	}

	public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		LOG.info("SE ELIMINA ATRIBUTO");		
		LOG.info(servletRequestAttributeEvent.getName());
		LOG.info(servletRequestAttributeEvent.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		LOG.info("SE REEMPLAZA ATRIBUTO");
		LOG.info(servletRequestAttributeEvent.getName());
		LOG.info(servletRequestAttributeEvent.getValue());
		
	}

}
