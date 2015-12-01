package ec.ocwcd.cap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "ServletConextoResources", value = "/pages/servletConextoResources")
public class ServletConextoResources extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(ServletConextoResources.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws IOException {
		LOG.info("POST-PATHS");
		ServletContext servletContext = getServletContext();
		LOG.info("ServletContextName:" + servletContext.getServletContextName());
		LOG.info("GetRealPath1:"
				+ servletContext.getRealPath("redirectjsp.jsp"));
		LOG.info("GetRealPath2:"
				+ servletContext
						.getRealPath("/internet-servlet-1.0.0/pages/servletCounterParameterCap4.html"));
		LOG.info("GetRealPath3:"
				+ servletContext
						.getRealPath("/../pages/servletCounterParameterCap4.html"));
		LOG.info("FOLDER ICONS");
		Set<String> listaRecursos = servletContext.getResourcePaths("/icons/");
		Iterator<String> iterator = listaRecursos.iterator();
		while (iterator.hasNext()) {
			LOG.info("GetResourcePaths:" + iterator.next());
		}
		LOG.info("FOLDER LOCAL");
		Set<String> listaRecursosLocal = servletContext.getResourcePaths("/");
		Iterator<String> iteratorLocal = listaRecursosLocal.iterator();
		while (iteratorLocal.hasNext()) {
			LOG.info("GetResourcePathsLocal:" + iteratorLocal.next());
		}
		LOG.info("CONTEXTO"
				+ servletContext.getContext("/internet-servlet-1.0.0/pages/"));
		LOG.info("LEER CABECERA");
		URL ulrTextoCabecara = servletContext
				.getResource("/files/cabecera.txt");
		LOG.info("LEER CUERPO");
		InputStream inputStreamCuerpo = servletContext
				.getResourceAsStream("/files/cuerpo.txt");
		LOG.info("RECURSOS ESTATICOS");
		PrintWriter writer = httpServletResponse.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>"
				+ getStringFromInputStream(ulrTextoCabecara.openStream())
				+ "</h1>");
		writer.println("<h3>" + getStringFromInputStream(inputStreamCuerpo)
				+ "</h3>");
		writer.println("</body>");
		writer.println("</html>");
	}

	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}

}