package ec.ocwcd.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ServletContextParameterCap4 extends HttpServlet {

	private static final Logger LOG = Logger
			.getLogger(ServletContextParameterCap4.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String title = getServletConfig().getInitParameter("apptitle");
		LOG.info("TITULO"+title);
		Writer writer = res.getWriter();
		LOG.info("DO GET");
		writer.write(title);
	}
	

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String title = getServletContext().getInitParameter("apptitle");
		LOG.info("TITULO"+title);
		Writer writer = res.getWriter();
		LOG.info("DO GET");
		writer.write(title);
	}

}
