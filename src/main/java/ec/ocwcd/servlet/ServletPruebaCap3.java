package ec.ocwcd.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class ServletPruebaCap3 extends HttpServlet {

	private static final Logger LOG = Logger.getLogger(ServletPruebaCap3.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		Writer writer = res.getWriter();
		LOG.info("IN SERVICE");
		writer.write("In service");
	}
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		Writer writer = res.getWriter();
		LOG.info("IN DOGET");
		writer.write("In doGet");
	}
	

}
