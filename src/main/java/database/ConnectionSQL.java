package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
	
	private static final String URL ="jdbc:mysql://localhost:3306/viagem";
	private static final String USER ="root";
	private static final String PASSWORD ="F1 e melhor que INDY";
	
	public static Connection CreateConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found"+e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Connected to the database");
			
			return connection;
		}catch(SQLException e){
			System.out.println("Not connected to the database"+ e.getMessage());
			return null;
		}
		
		
		
		
		
		
		
	}

}
