package project.generalServlet;


import project.dao.loginDAO;
//import com.learn.mycart.entites.Customer;
//import com.learn.mycart.helper.FactoryProvider;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class loginServlet extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      try ( PrintWriter out = response.getWriter()) {
          String uname = request.getParameter("uname");
          String password = request.getParameter("pass");
          
          loginDAO dao = new loginDAO();

          if (dao.check(uname, password)) {
              HttpSession session = request.getSession();
              session.setAttribute("username", uname);
              session.setAttribute("customerID", dao.getCustomerID(uname, password));
              response.sendRedirect("index.jsp");
          } else {
              response.sendRedirect("registration.jsp");
          }
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