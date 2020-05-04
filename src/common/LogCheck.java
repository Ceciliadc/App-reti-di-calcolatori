package common;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogCheck")
public class LogCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LogCheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin = request.getParameter("admin");
		String pwd = request.getParameter("password");
		
		if(admin.equals("ceci") && pwd.equals("1234")) {
		 	response.sendRedirect("welcome.jsp");
		}
		else {
			PrintWriter out=response.getWriter();
			out.print("Username o Password errati"); 
		}
		
		
	}

}
