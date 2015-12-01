package ec.ocwcd.cap5;

import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "ServletRequestWeb", value = "/pages/servletRequestWeb")
public class ServletRequestWeb extends HttpServlet {
	private static final Logger LOG = Logger.getLogger(ServletRequestWeb.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		Enumeration<String> listaAtributo = httpServletRequest
				.getAttributeNames();
		while (listaAtributo.hasMoreElements()) {
			LOG.info(listaAtributo.nextElement());
		}
		httpServletRequest.getAttribute("atributo1");
		httpServletRequest.setAttribute("atributo2", 1000);
		httpServletRequest.removeAttribute("atributo1");

	}

}
