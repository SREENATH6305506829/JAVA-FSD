import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.ecommerce.EProduct;
import com.ecommerce.HibernateUtil;
import com.ecommerce.ProductParts;

@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();

			List<EProduct> list = session.createQuery("from EProduct").list();

			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			out.println("<b>Component Mapping</b><br>");
			for (EProduct p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
						+ String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
				ProductParts parts = p.getParts();
				out.println("Parts =" + parts.getCpu() + ", " + parts.getHdd() + ", " + parts.getRam());
				out.println("<hr>");
			}

			session.close();

			out.println("</body></html>");

		} catch (Exception ex) {
			throw ex;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
