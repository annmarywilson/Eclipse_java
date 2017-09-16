package net.opentrends.databaseproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static String Username="dbuser";
	public static String Password="db1234";
	public static String Mconnect="jdbc:mysql://localhost/explorecalifornia";
	public static String Hconnect="jdbc:hsqldb:data/explorecalifornia";
	public static Connection getConnection(DBtype db) throws SQLException {
		switch (db) {
		case MYSQL:
			return DriverManager.getConnection(Mconnect,Username,Password);
			
		case HSQLDB:
			return DriverManager.getConnection(Hconnect,Username,Password);
			
		default:
			return null;
		}
	}
	public static void processerror(SQLException e) {
		System.out.println("Error Message:"+e.getMessage());
		System.out.println("Error Code:"+e.getErrorCode());
		System.out.println("SQL State:"+e.getSQLState());
	}
}
