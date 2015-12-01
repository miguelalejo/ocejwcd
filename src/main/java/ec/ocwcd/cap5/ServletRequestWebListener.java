package ec.ocwcd.cap5;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.apache.log4j.Logger;

public class ServletRequestWebListener implements ServletRequestListener {
	private static final Logger LOG = Logger
			.getLogger(ServletRequestWebListener.class);
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		LOG.info("PETICION REQUEST DESTRUIDA");
		LOG.info(servletRequestEvent.getServletContext());
		LOG.info(servletRequestEvent.getServletRequest());
		
	}

	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		LOG.info("PETICION REQUEST INICIALIZADA");
		LOG.info(servletRequestEvent.getServletContext());
		LOG.info(servletRequestEvent.getServletRequest());
		
	}

}
