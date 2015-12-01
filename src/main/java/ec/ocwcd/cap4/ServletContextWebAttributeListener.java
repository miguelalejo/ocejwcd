package ec.ocwcd.cap4;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

import org.apache.log4j.Logger;

public class ServletContextWebAttributeListener implements
		ServletContextAttributeListener {

	private static final Logger LOG = Logger
			.getLogger(ServletContextWebAttributeListener.class);

	public void attributeAdded(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		LOG.info(String.format("Se agrega %s,  %s",
				servletContextAttributeEvent.getName(),
				servletContextAttributeEvent.getValue()));
	}

	public void attributeRemoved(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		LOG.info(String.format("Se elimina %s,  %s",
				servletContextAttributeEvent.getName(),
				servletContextAttributeEvent.getValue()));

	}

	public void attributeReplaced(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		LOG.info(String.format("Se reemplaza %s,  %s",
				servletContextAttributeEvent.getName(),
				servletContextAttributeEvent.getValue()));

	}

}
