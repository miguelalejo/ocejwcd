package ec.ocwcd.cap4;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name="servletConextoWeb",value="/pages/servletConextoWeb")
public class ServletConextoWeb extends HttpServlet {

	private static final Logger LOG = Logger.getLogger(ServletConextoWeb.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		LOG.info("POST");
		ServletContext servletContext = httpServletRequest.getServletContext();
		Object objeto = servletContext.getAttribute("atributo1");
		LOG.info("atributo1 : " + objeto);
		Enumeration<String> listaNombresAtributos = servletContext
				.getAttributeNames();
		LOG.info("LISTA ATRIBUTOS");
		while (listaNombresAtributos.hasMoreElements()) {
			String nombreAtributo = listaNombresAtributos.nextElement();
			LOG.info(String.format("nombre %s ,valor %s ", nombreAtributo,
					servletContext.getAttribute(nombreAtributo)));
		}
		servletContext.setAttribute("atributo1", 1);
		servletContext.setAttribute("atributo2", 100);
		servletContext.setAttribute("atributo3", "Atributo 3");
		servletContext.removeAttribute("atributo2");
		LOG.info("CONTEXT NAME" + servletContext.getServletContextName());		
		httpServletResponse.sendRedirect("./impresionAtributos.jsp");
	}
	
	@Override
	public void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		LOG.info("GET");
		ServletContext servletContext = getServletContext();
		Object objeto = servletContext.getAttribute("atributo1");
		LOG.info("atributo1 : " + objeto);
		Enumeration<String> listaNombresAtributos = servletContext
				.getAttributeNames();
		LOG.info("LISTA ATRIBUTOS");
		while (listaNombresAtributos.hasMoreElements()) {
			String nombreAtributo = listaNombresAtributos.nextElement();
			LOG.info(String.format("nombre %s ,valor %s ", nombreAtributo,
					servletContext.getAttribute(nombreAtributo)));
		}
		servletContext.setAttribute("atributo1", 1);
		servletContext.setAttribute("atributo2", 100);
		servletContext.setAttribute("atributo3", "Atributo 3");
		servletContext.removeAttribute("atributo2");
		LOG.info("CONTEXT NAME" + servletContext.getServletContextName());		
		httpServletResponse.sendRedirect("./impresionAtributos.jsp");
	}

}
