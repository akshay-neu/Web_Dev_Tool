import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.io.IOException;


public class GetXMethodsHeader extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ip = request.getRemoteAddr();
		PrintWriter out = response.getWriter();
	

		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<title>GetMethods</title>");
		out.println("</HEAD>");
		out.println("<BODY>");
		
		if(request.getAttributeNames() != null)
		{out.println("getAttributeNames : "+	request.getAttributeNames().toString());}
		out.println("<br><br>");

		if(request.getContentType() != null)
		{out.println("getContentType : "+request.getContentType().toString());} 
		out.println("<br><br>");
		 
		if(request.getDispatcherType() != null) 
		{out.println("getDispatcherType : "+request.getDispatcherType());} 
		out.println("<br><br>");
		
		if(request.getProtocol() != null)
		{out.println("getProtocol : "+request.getProtocol().toString());} 
		out.println("<br><br>");
		
		if(request.getRemoteAddr() != null)
		{out.println("getRemoteAddr : "+request.getRemoteAddr().toString());}
		out.println("<br><br>");

		if(request.getRemoteHost() != null)
		{out.println("getRemoteHost : "+request.getRemoteHost().toString());}
		out.println("<br><br>");

		if(request.getScheme() != null)
		{out.println("getScheme : "+request.getScheme().toString());}
		out.println("<br><br>");
		if(request.getInputStream() != null)
		{out.println("getInputStream : "+request.getInputStream().toString());} 
		out.println("<br><br>");
		
		if(request.getLocalAddr() != null)
		{out.println("getLocalAddr : "+request.getLocalAddr().toString());} 
		out.println("<br><br>");
		
		if(request.getLocale() != null)
		{out.println("getLocale : "+request.getLocale().toString());}
		out.println("<br><br>");
		
		if(request.getLocales() != null) 
		{out.println("getLocales : "+request.getLocales().toString());}
		out.println("<br><br>");
		
		if(request.getLocalName() != null)
		{out.println("getLocalName : "+request.getLocalName().toString());} 
		out.println("<br><br>");
		
		if(request.getParameterMap() != null)
		{out.println("getParameterMap : "+request.getParameterMap().toString());}
		out.println("<br><br>");
		 
		if(request.getParameterNames() != null)
		{out.println("getParameterNames : "+request.getParameterNames().toString());}
		out.println("<br><br>");

		if(request.getServerName() != null)
		{out.println("getServerName : "+request.getServerName().toString());} 
		out.println("<br><br>");
	
		if(request.getServletContext() != null)
		{out.println("getServletContext : "+request.getServletContext().toString());} 
		out.println("<br><br>");




		out.println("<hr>");
		out.println("<br><br>");
		out.println("<h2>HttpServletRequest</h2>");
		out.println("<br><br>");
		

		
		if(request.getAuthType() != null)
		{out.println("getAuthType :"+request.getAuthType().toString());} 
		out.println("<br><br>");

		if(request.getContextPath() != null)
		{out.println("getContextPath : "+request.getContextPath().toString());}
		out.println("<br><br>");
	
		if(request.getCookies() != null)
		 {out.println("getCookies : "+request.getCookies().toString());} 
		out.println("<br><br>");
	
		if(request.getHeaderNames() != null) 
		{out.println("getHeaderNames : "+request.getHeaderNames().toString());} 
		out.println("<br><br>");

		if(request.getMethod() != null) 
		{out.println("getMethod : "+request.getMethod().toString());} 
		out.println("<br><br>");

		if(request.getPathInfo() != null)
		{out.println("getPathInfo : "+ request.getPathInfo().toString());} 
		out.println("<br><br>");
		
		if(request.getRequestURL() != null) 
		{out.println("getRequestURL : "+request.getRequestURL().toString());} 
		out.println("<br><br>");
	
		if(request.getServletPath() != null)
		{out.println("getServletPath : "+request.getServletPath().toString());}
		 out.println("<br><br>");
		  
		if(request.getSession() != null) 
		{out.println("getSession : "+request.getSession().toString());} 
		out.println("<br><br>");
		
		if(request.getSession() != null) 
		{out.println("getSession : "+request.getSession().toString());} 
		out.println("<br><br>");
		
		if(request.getPathTranslated() != null) 
		{out.println("getPathTranslated : "+request.getPathTranslated().toString());} 
		out.println("<br><br>");
		
		if(request.getQueryString() != null)
		{out.println("getQueryString : "+request.getQueryString().toString());} 
		out.println("<br><br>");
		 
		if(request.getRemoteUser() != null)
		{out.println("getRemoteUser : "+request.getRemoteUser().toString());} 
		out.println("<br><br>");
		
		if(request.getRequestedSessionId() != null)
		{out.println("getRequestedSessionId : "+request.getRequestedSessionId().toString());} 
		out.println("<br><br>");
		
		if(request.getRequestURI() != null) 
		{out.println("getRequestURI : "+request.getRequestURI().toString());} 
		out.println("<br><br>");

		
		out.println("</BODY>");
		out.println("</HTML>");
		
	}
	
	public void destroy() {
		
	}
	
}