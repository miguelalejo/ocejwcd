package ec.ocwcd.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ServletInitParameterCap4 extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(ServletInitParameterCap4.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Writer writer = res.getWriter();
		Enumeration<String> parametrosInicio=getServletConfig().getInitParameterNames();
		while(parametrosInicio.hasMoreElements()){
			String name=(String) parametrosInicio.nextElement();
			String value=(String) getInitParameter(name);
			LOG.info("Parametros"+value);
			writer.write(value);
		}
		
	}
	

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Writer writer = res.getWriter();
		Enumeration<String> parametrosInicio=getInitParameterNames();
		while(parametrosInicio.hasMoreElements()){
			String name=(String) parametrosInicio.nextElement();
			String value=(String) getServletConfig().getInitParameter(name);
			LOG.info("Parametros"+value);
			writer.write(value);
		}
	}

}
