package ec.ocwcd.cap4;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.descriptor.JspConfigDescriptor;

public class ContextoWeb implements ServletContext {

	public Dynamic addFilter(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Dynamic addFilter(String arg0, Filter arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Dynamic addFilter(String arg0, Class<? extends Filter> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addListener(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public <T extends EventListener> void addListener(T arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addListener(Class<? extends EventListener> arg0) {
		// TODO Auto-generated method stub
		
	}

	public javax.servlet.ServletRegistration.Dynamic addServlet(String arg0,
			String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public javax.servlet.ServletRegistration.Dynamic addServlet(String arg0,
			Servlet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public javax.servlet.ServletRegistration.Dynamic addServlet(String arg0,
			Class<? extends Servlet> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Filter> T createFilter(Class<T> arg0)
			throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends EventListener> T createListener(Class<T> arg0)
			throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Servlet> T createServlet(Class<T> arg0)
			throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	public void declareRoles(String... arg0) {
		// TODO Auto-generated method stub
		
	}

	public Object getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public ClassLoader getClassLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	public ServletContext getContext(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getContextPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getEffectiveMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getEffectiveMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
		// TODO Auto-generated method stub
		return null;
	}

	public FilterRegistration getFilterRegistration(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInitParameter(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public JspConfigDescriptor getJspConfigDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getMimeType(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public RequestDispatcher getNamedDispatcher(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRealPath(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestDispatcher getRequestDispatcher(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public URL getResource(String arg0) throws MalformedURLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getResourceAsStream(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getResourcePaths(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServerInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Servlet getServlet(String arg0) throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletContextName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration<String> getServletNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public ServletRegistration getServletRegistration(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, ? extends ServletRegistration> getServletRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration<Servlet> getServlets() {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionCookieConfig getSessionCookieConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public void log(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void log(Exception arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public void log(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	public void removeAttribute(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public boolean setInitParameter(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setSessionTrackingModes(Set<SessionTrackingMode> arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
