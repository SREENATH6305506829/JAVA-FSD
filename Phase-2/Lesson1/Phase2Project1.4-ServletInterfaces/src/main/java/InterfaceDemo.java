import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
	ServletConfig config=null;
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("Initialization complete");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("In the service() method<br>");
		pw.println("</body>");
		pw.println("<html>");
	}

	public void destroy() {
		System.out.println("In Destroy() method");
	}

	public ServletConfig getServletConfig() {
		return config;
	}
	
	public String getServletInfo() {
		return"This is a sample servlet info"; 
	}
}
