package common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


@WebServlet("/Update_Data")
public class Update_Data extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Update_Data() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tel = request.getParameter("tel");
		String data = request.getParameter("data");
		String conferma = request.getParameter("confirmation");
		
		PreparedStatement ps = null;
		
		try {
			DbManager db = new DbManager();
			Connection conn = db.getConnection(); 
			String query="update prenotazioni set conferma = ? where num_telefono = ? && data_prenotazione = ?";
			
			ps=conn.prepareStatement(query);
			
			ps.setString(1, conferma);
			ps.setString(2, tel);
			ps.setString(3, data);
			
			ps.executeUpdate();
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("welcome.jsp");

	}

}
