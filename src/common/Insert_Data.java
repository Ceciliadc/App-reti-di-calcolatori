package common;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@WebServlet("/Insert_Data")
public class Insert_Data extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    public Insert_Data() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String data_prenotazione = request.getParameter("data_prenotazione");
		String turno = request.getParameter("turno");
		String num_persone = request.getParameter("num_persone");
		String num_telefono = request.getParameter("num_telefono");

		PreparedStatement ps = null;
		
		try {
			DbManager db = new DbManager();
			Connection conn = db.getConnection();
			
			String query="insert into prenotazioni values(?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(query);
			
			ps.setString(1, nome);
			ps.setString(2, cognome);
			ps.setString(3, data_prenotazione);
			ps.setString(4, turno);
			ps.setString(5, num_persone);
			ps.setString(6, num_telefono);
			ps.setString(7, "Da confermare");

			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JFrame window = new JFrame();
		window.setVisible(true);
		JOptionPane.showMessageDialog(window, "Prenotazione effettuata");
		
		response.sendRedirect("prenota.jsp");
	}

}
