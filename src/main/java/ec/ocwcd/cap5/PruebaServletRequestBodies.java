package ec.ocwcd.cap5;

import java.io.IOException;
import java.io.Reader;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.log4j.Logger;

@WebServlet(name = "pruebaServletRequestBody", value = "/pages/pruebaServletRequestBody")
public class PruebaServletRequestBodies extends GenericServlet {

	private static final Logger LOG = Logger
			.getLogger(PruebaServletRequestBodies.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest servletRequest,
			ServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("OBTENCION DE INPUT STREAM");
		LOG.info("ERROR IllegalStateException");
		ServletInputStream servletInputStream = servletRequest.getInputStream();
		LOG.info(servletInputStream);
		Reader reader = servletRequest.getReader();
		LOG.info(reader);

	}

}
