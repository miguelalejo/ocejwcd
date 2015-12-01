package ec.ocwcd.cap4;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class ServletContextoWebListener implements ServletContextListener {
	private static final Logger LOG = Logger
			.getLogger(ServletContextoWebListener.class);

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		LOG.info("FINALIZA CONTEXTO SERVLET");
		LOG.info(servletContextEvent.getServletContext()
				.getServletContextName());

	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		LOG.info("INICIA CONTEXTO SERVLET");
		LOG.info(servletContextEvent.getServletContext()
				.getServletContextName());
	}

}
