package it.polito.tdp.zaino.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static String jdbcURL = "jdbc:mysql://localhost/zaino?user=root" ;
	
	public static Connection getConnection() {
		
		try {
			Connection c = DriverManager.getConnection(jdbcURL) ;
			return c ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
	}

}
