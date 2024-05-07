package default_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connection {
	
	private static Db_Connection db_connection = null;
	private static Connection con = null;
	private String userName = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/sys";
	private String driverClass = "com.mysql.jdbc.Driver";
	
	private Db_Connection() throws ClassNotFoundException, SQLException {
		Class.forName(driverClass);
		con = DriverManager.getConnection(url,userName,password);
		con.setAutoCommit(false);
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (null != db_connection) {
			return con;
		
		} else {
			db_connection = new Db_Connection();
			return con;
		}
	
	}

}
