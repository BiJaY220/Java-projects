package Productweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDAO<T> implements DAO<T> {
	String driver = "com.mysql.cj.jdbc.Driver";
	
	String url = "Jdbc:mysql://localhost:3306/productDb";
	String username = "root";
	String password = "Bijay@123";
	Connection con;
	
	@Override
	public void connect() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
		
	}
	@Override
	public void disconnect() throws SQLException {
		con.close();
		
	}
	
	
	

}
