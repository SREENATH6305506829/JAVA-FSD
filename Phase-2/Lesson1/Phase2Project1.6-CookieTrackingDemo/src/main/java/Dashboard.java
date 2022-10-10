

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Cookie cookie=null;
	Cookie[]cookies=null;
	boolean found =false;
	PrintWriter pw=response.getWriter();
	pw.println("<html><body>");
	cookies=request.getCookies();
	if(cookies!=null) {
		for(int i=0;i<cookies.length;i++) {
			cookie=cookies[i];
			if(cookie.getName().contentEquals("userid")&&cookie.getValue()!=null) {
				pw.println("userid read from cookie: "+cookie.getValue()+"<br>");
				found=true;
			}
		}
	}
	if(!found) {
		pw.println("No userid was found in cookie.<br>");
	}
	}
}
