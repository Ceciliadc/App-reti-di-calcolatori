package common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@WebServlet("/Delete_Data")
public class Delete_Data extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    public Delete_Data() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String tel = request.getParameter("tel");
		String data = request.getParameter("data");
		PreparedStatement ps = null;
		
		try {
			DbManager db = new DbManager();
			Connection conn = db.getConnection(); 
			String query="delete from prenotazioni where num_telefono = ? && data_prenotazione = ?";
			
			ps=conn.prepareStatement(query);
	
			ps.setString(1, tel);
			ps.setString(2, data);
			
			ps.executeUpdate();
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		JFrame window = new JFrame();
		window.setVisible(true);
		JOptionPane.showMessageDialog(window, "Prenotazione cancellata");
		
		request.setAttribute("num_telefono", tel);
		RequestDispatcher rd = request.getRequestDispatcher("gestione.jsp");
		rd.forward(request, response);
	
	}
}
