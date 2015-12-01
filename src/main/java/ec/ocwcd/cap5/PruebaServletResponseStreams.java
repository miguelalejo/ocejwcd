package ec.ocwcd.cap5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "PruebaServletResponseStreams", value = "/pages/pruebaServletResponseStreams")
public class PruebaServletResponseStreams extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(PruebaServletResponseStreams.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("ERROR ESTADO ILEGAL");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		Writer writer = servletResponse.getWriter();
		writer.write("MUNDO");
	}
	
	public void doPost(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("FLUSH");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		LOG.info("IS COMMITES ANTES DEL FLUSH"+servletResponse.isCommitted());
		servletResponse.flushBuffer();
		LOG.info("Tama;o del buffer"+servletResponse.getBufferSize());
		outputStream.write("Mundo".getBytes());
		LOG.info("IS COMMITES DESPUES DEL FLUSH"+servletResponse.isCommitted());
	}

}
