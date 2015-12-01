package ec.ocwcd.cap5;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "PruebaServletResponseRedirection", value = "/pruebaServletResponseRedirection")
public class PruebaServletResponseRedirection extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(PruebaServletResponseRedirection.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		httpServletResponse.sendError(100);
	}

	public void doPost(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		httpServletResponse.sendError(400);
	}

	public void doDelete(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		httpServletResponse.sendError(301, "SE PRODUJO ERRRO 301");
	}

	public void doHead(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		httpServletResponse.sendRedirect("/pages/display.sjp");
	}

	public void doPut(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		LOG.info("HEAD");
		String encodeURL = httpServletResponse.encodeURL("/pages/miurl");
		String encodeRedirectURL=httpServletResponse.encodeRedirectURL("/pages/miurl");
		LOG.info("encodeURL"+encodeURL);
		LOG.info("encodeRedirectURL"+encodeRedirectURL);
		
		httpServletResponse.getOutputStream().write(encodeURL.getBytes());
		httpServletResponse.getOutputStream().write(encodeRedirectURL.getBytes());
		httpServletResponse.flushBuffer();
	}

}
