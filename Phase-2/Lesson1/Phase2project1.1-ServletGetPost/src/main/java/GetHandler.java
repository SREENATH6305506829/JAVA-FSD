

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getHandler")
public class GetHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetHandler() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =response.getWriter();
		pw.println("<h1 html/text /h1>");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		pw.println("Name= "+name+"<br> Address= "+address);
		pw.println("<h1 html/text /h1>");
	}

}
