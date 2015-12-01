package ec.ocwcd.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class ServletCounterParameterCap4 extends GenericServlet {

	private static final Logger LOG = Logger
			.getLogger(ServletCounterParameterCap4.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		LOG.info("DO SERVICE");
		ServletContext servletContext = getServletContext();		
		LOG.info("VALOR CONTADOR"+servletContext.getAttribute("hitcounter"));
		Integer counter = (Integer) servletContext.getAttribute("hitcounter");
		if (counter == null) {
			counter = new Integer(1);
		} else {
			counter++;
		}
		LOG.info(counter);
		servletContext.setAttribute("hitCounter", counter);
		Writer writer = res.getWriter();
		
		writer.write("VISTA NUMERO" + counter);
	}

}
