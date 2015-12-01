package ec.ocwcd.cap5;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "PruebaServletResponseTransmitionData", value = "/pages/pruebaServletResponseTransmitionData")
public class PruebaServletResponseTransmitionData extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(PruebaServletResponseTransmitionData.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) {
		LOG.info("Conjunto de caracteres:"
				+ servletResponse.getCharacterEncoding());
		LOG.info("Ubicacion" + servletResponse.getLocale());
		LOG.info("Tipo Contenido" + servletResponse.getContentType());
	}

	public void doPost(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("FLUSH - RESET BUFFER");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		servletResponse.flushBuffer();
		servletResponse.setCharacterEncoding("UTF-8");
		Locale locale = Locale.CHINESE;
		servletResponse.setLocale(locale);
		servletResponse.setContentType("application/xml");
		servletResponse.setContentLength(1);
	}

}
