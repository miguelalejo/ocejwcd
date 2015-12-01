package ec.ocwcd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;


public class ListenerAtributoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(ListenerAtributoServlet.class);
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOG.info("INGRESO AL SERVLET LISTENER ATRIBUTO");
		HttpSession httpSession=request.getSession(true);
		httpSession.setAttribute("ATR1", "ATRIBUTO UNO");
		httpSession.setAttribute("ATR2", 2);
		httpSession.removeAttribute("NUEVO");		
		httpSession.removeAttribute("ATR2");
		httpSession.setAttribute("ATR1",  "ATRIBUTO UNO MODIFICADO");
	}
}
