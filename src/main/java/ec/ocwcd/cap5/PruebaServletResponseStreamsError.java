package ec.ocwcd.cap5;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "PruebaServletResponseStreamsError", value = "/pages/pruebaServletResponseStreamsError")
public class PruebaServletResponseStreamsError extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(PruebaServletResponseStreamsError.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("FLUSH - RESET");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		servletResponse.flushBuffer();
		servletResponse.reset();
		outputStream.write("Mundo".getBytes());
	}

	public void doPut(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("FLUSH - RESET BUFFER");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		servletResponse.flushBuffer();
		servletResponse.resetBuffer();
		outputStream.write("Mundo".getBytes());
	}
	
	public void doDelete(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("RESET BUFFER");
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		servletResponse.resetBuffer();
		outputStream.write("Mundo".getBytes());
	}

	public void doPost(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("FLUSH");
		//Si se pone el buffer despues da un error Cannot change buffer size after data has been written
		servletResponse.setBufferSize(1);
		OutputStream outputStream = servletResponse.getOutputStream();
		outputStream.write("saludo".getBytes());
		outputStream.write("Mundo".getBytes());
	
		LOG.info("IS COMMIT SIN FLUSH"
				+ servletResponse.isCommitted());
	}

}
