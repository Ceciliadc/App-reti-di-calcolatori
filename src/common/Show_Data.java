package common;
import java.sql.*;
import java.util.*;


public class Show_Data {
	
		DbManager db = new DbManager();
		Connection conn = db.getConnection();
	
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<User> list = new ArrayList<User>();
		
		String query="select * from prenotazioni";
		
	public List<User> get_data(){

		try {

			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				User obj_User=new User();
				
				obj_User.setNome(rs.getString("nome"));
				obj_User.setCognome(rs.getString("cognome"));
				obj_User.setData_prenotazione(rs.getString("data_prenotazione"));
				obj_User.setTurno(rs.getString("turno"));
				obj_User.setNum_persone(rs.getString("num_persone"));
				obj_User.setNum_telefono(rs.getString("num_telefono"));
				obj_User.setConferma(rs.getString("conferma"));
				
				list.add(obj_User);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public List<User> get_user(String tel){
		
		try {
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				User obj_User=new User();
				
				obj_User.setNome(rs.getString("nome"));
				obj_User.setCognome(rs.getString("cognome"));
				obj_User.setData_prenotazione(rs.getString("data_prenotazione"));
				obj_User.setTurno(rs.getString("turno"));
				obj_User.setNum_persone(rs.getString("num_persone"));
				obj_User.setNum_telefono(rs.getString("num_telefono"));
				obj_User.setConferma(rs.getString("conferma"));
				
				if(tel.equals(obj_User.getNum_telefono())) {
					list.add(obj_User);
				}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
