package ec.ocwcd.cap5;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "PruebaHttpServletResponse", value = "/pruebaHttpServletResponse")
public class PruebaHttpServletResponse extends HttpServlet {

	/**
	 * 
	 */
	private static final Logger LOG = Logger
			.getLogger(PruebaHttpServletResponse.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("ADD HEADER XXX");
		servletResponse.addHeader("CABECERA1", "AGREGA CABECERA");
		servletResponse.addIntHeader("CABECERA2", 1);
		servletResponse.addDateHeader("CABECERA3", new Date().getTime());
	}

	public void doPost(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("SET HEADER XXX");
		servletResponse.setHeader("PRUEBA1", "REEMPLAZO PRUEBA");
		servletResponse.setIntHeader("PRUEBA2", 10000);
		servletResponse.setDateHeader("PRUEBA3", new Date().getTime());
		LOG.info(servletResponse.containsHeader("CABECERA"));
		servletResponse.getWriter().write(
				String.valueOf(servletResponse.containsHeader("CABECERA1")));
	}

}
