package project.generalServlet;

import project.dao.DeleteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Purchase")
public class Purchase extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            /* TODO output your page here. You may use following sample code. */

            HttpSession session = request.getSession();
            if (session.getAttribute("username") == null) {
                response.sendRedirect("registration.jsp");
            } else {
//                String custID = session.getAttribute("customerID");
                String custID = request.getParameter("custID");
                String houseid = request.getParameter("HouseId");
                String ProductkeyId = request.getParameter("ProductKeyId");
                DeleteDao dao = new DeleteDao();

                if (dao.check(houseid, ProductkeyId, request)) {
                    response.sendRedirect("/project/payment");
                } else {
//                    out.print("<h1>Problem Occuredd</h1>");
                }
            }

        }catch(Exception e) {
        	e.printStackTrace();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
