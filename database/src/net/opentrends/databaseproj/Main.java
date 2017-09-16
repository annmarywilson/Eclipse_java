package net.opentrends.databaseproj;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Main {

	
	
	public static void main(String[] args) throws SQLException {
		//Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection(DBtype.HSQLDB);
			System.out.println("Connected");
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery("SELECT * FROM states");
			while(rs.next()) {
			System.out.println(rs.getString("stateName"));	
			}
			rs.last();
			System.out.println("Number of rows:"+rs.getRow());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			DBUtil.processerror(e);
		}
		if(rs!=null) {
			rs.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}

}
