package ec.ocwcd.cap4;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "servletConextoInitParameters", value = "/servletConextoInitParameters", initParams = {
		@WebInitParam(name = "parametroUno", value = "100"),
		@WebInitParam(name = "parametroDos", value = "CIEN") })
public class ServletConextoInitParameters extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(ServletConextoInitParameters.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		LOG.info("GET");
		LOG.info("parametros context-param");
		ServletContext servletContext = getServletContext();
		Enumeration<String> listaParametrosInicio = servletContext
				.getInitParameterNames();
		while (listaParametrosInicio.hasMoreElements()) {
			String parametro = listaParametrosInicio.nextElement();
			LOG.info(String.format("%s,%s", parametro,
					servletContext.getInitParameter(parametro)));
		}
		LOG.info("parametros init-param");
		ServletConfig servletConfig = getServletConfig();
		Enumeration<String> listaParametrosServlet = getServletConfig()
				.getInitParameterNames();
		while (listaParametrosServlet.hasMoreElements()) {
			String parametro = listaParametrosServlet.nextElement();
			LOG.info(String.format("Servlet %s,%s", parametro,
					servletConfig.getInitParameter(parametro)));
			LOG.info(String.format("Context %s,%s", parametro,
					servletContext.getInitParameter(parametro)));
		}
	}

}
