package common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	
	public static void main(String[] args) {
		DbManager db = new DbManager();
		System.out.println(db.getConnection());
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_prenotazioni?useSSL=false&amp&useJDBCCompliantTimezoneShift=true&amp&useLegacyDatetimeCode=false&amp&serverTimezone=UTC","root","Nipotini4");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
