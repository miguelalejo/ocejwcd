package ec.ocwcd.cap5;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.log4j.Logger;

@WebServlet(name = "PruebaServletResponse", value = "/pruebaServletResponse")
public class PruebaServletResponse extends GenericServlet {
	private static final Logger LOG = Logger
			.getLogger(PruebaServletResponse.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest servletRequest,
			ServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("CREACION SALUDO RESPONSE");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		outputStream.write("Mundo".getBytes());
	}
	
}
