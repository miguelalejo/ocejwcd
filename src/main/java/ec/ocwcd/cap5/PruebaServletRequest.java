package ec.ocwcd.cap5;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.log4j.Logger;

@WebServlet(name = "pruebaServletRequest", value = "/pages/pruebaServletRequest")
public class PruebaServletRequest extends GenericServlet {

	private static final Logger LOG = Logger
			.getLogger(PruebaServletRequest.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest servletRequest,
			ServletResponse servletResponse) throws ServletException,
			IOException {
		LOG.info("OBTENCIOON DE ATRIBUTOS");
		LOG.info(servletRequest.getAttribute("atributo1"));
		LOG.info(servletRequest.getAttribute("atributo2"));
		Enumeration<String> listaAtributos = servletRequest.getAttributeNames();
		while (listaAtributos.hasMoreElements()) {
			String nombreAtributo = listaAtributos.nextElement();
			LOG.info(servletRequest.getAttribute(nombreAtributo));

		}
		servletRequest.setAttribute("atributo1", 1);
		servletRequest.setAttribute("atributo2", servletResponse);
		servletRequest.removeAttribute("atributo2");
		LOG.info("OBTENCION DE PARAMETROS");
		String[] listaParametrosRepetidos = servletRequest
				.getParameterValues("param1");
		for (String parametro : listaParametrosRepetidos) {
			LOG.info("PARAMETRO:" + parametro);
		}
		String parametro = servletRequest.getParameter("param2");
		LOG.info("PARAMETRO2:" + parametro);

		Enumeration<String> listaNombreParametros = servletRequest
				.getParameterNames();
		LOG.info("LISTA NOMBRE PARAMETROS");
		while (listaNombreParametros.hasMoreElements()) {
			LOG.info(listaNombreParametros.nextElement());
		}
		LOG.info("MAPA PARAMETROS");
		Map<String, String[]> mapaParametros = servletRequest.getParameterMap();
		for (String keyParametroM : mapaParametros.keySet()) {
			String[] listaParametrosRep = mapaParametros.get(keyParametroM);
			for (String parametroRep : listaParametrosRep) {
				LOG.info("PARAMETRO REP:" + parametroRep);
			};
		}
		

	}

}
