package ec.ocwcd.cap5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@WebServlet(name = "pruebaHttpServletRequest", value = "/pruebaHttpServletRequest")
public class PruebaHttpServletRequest extends HttpServlet {
	private static final Logger LOG = Logger
			.getLogger(PruebaHttpServletRequest.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		LOG.info("CABECERAS");
		Enumeration<String> listaCabeceras = httpServletRequest
				.getHeaders("cabecera");
		while (listaCabeceras.hasMoreElements()) {
			LOG.info(listaCabeceras.nextElement());
		}
		LOG.info("CABECERA");
		String header = httpServletRequest.getHeader("cabecera2");
		LOG.info(header);
		LOG.info("LISTA NOMBRES CABECERAS");
		Enumeration<String> listaNombresCabeceras = httpServletRequest
				.getHeaderNames();
		while (listaNombresCabeceras.hasMoreElements()) {
			LOG.info(listaNombresCabeceras.nextElement());
		}
		LOG.info("CABECERA ENTERA");
		Integer cabeceraEntera = httpServletRequest
				.getIntHeader("cabeceraEntera");
		LOG.info(cabeceraEntera);
		LOG.info("CABECERA FECHA");
		Long cabeceraFecha = httpServletRequest.getDateHeader("cabeceraFecha");
		LOG.info(cabeceraFecha);
		LOG.info("SEGURIDAD");
		LOG.info(httpServletRequest.getAuthType());
		LOG.info(httpServletRequest.getRemoteUser());
		LOG.info(httpServletRequest.getUserPrincipal());
		LOG.info(httpServletRequest.isUserInRole("VISTA"));
	}

	public void doPost(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		LOG.info("MANEJO DE SESIONES");
		LOG.info(httpServletRequest.getRequestedSessionId());
		HttpSession httpSession = httpServletRequest.getSession();
		if (httpSession != null) {
			LOG.info(httpSession.getLastAccessedTime());
		} else {
			LOG.info("Session no creada");
		}
		HttpSession httpSessionNueva = httpServletRequest.getSession(true);
		LOG.info(httpSessionNueva.getCreationTime());
		if (httpServletRequest.isRequestedSessionIdFromCookie()) {
			LOG.info("Session creada desde una cookie");
		}
		if (httpServletRequest.isRequestedSessionIdFromURL()) {
			LOG.info("Es creada una sesion desde la URL");
		}
		if (httpServletRequest.isRequestedSessionIdValid()) {
			LOG.info("El Id de la session es valido");
		}
	}

	public void doPut(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		try {
			LOG.info("RECPECION ARCHIVO");
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(httpServletRequest.getInputStream()));
			File file = new File("D://archivo.txt");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			while ((bufferedReader.readLine()) != null) {
				bufferedWriter.write(bufferedReader.readLine());
				LOG.info(bufferedReader.readLine());
			}
			bufferedReader.close();
			bufferedWriter.close();
			LOG.info("RUTA ARCHIVO"+file.getAbsolutePath());
		} catch (IOException e) {
			LOG.info(e.getMessage());
		}
	}
}
