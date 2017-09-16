package com.lynda.javatraining.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lynda.javatraining.db.tables.Tours;
import com.lynda.javatraining.util.InputHelper;

public class Main {

		
	private static final String SQL = 
			"SELECT tourId, tourName, price FROM tours where price<= ?";

	public static void main(String[] args) throws Exception {
		double maxprice;
		try {
			maxprice=InputHelper.getDoubleInput("Enter the Maximum Price");
		}
		catch(NumberFormatException e){
		System.err.println(e);	
		return;
		}
		ResultSet rs = null;
		try (
				Connection conn = DBUtil.getConnection(DBType.MYSQL);
				PreparedStatement stmt = conn.prepareStatement(SQL,
						ResultSet.TYPE_SCROLL_INSENSITIVE, 
						ResultSet.CONCUR_READ_ONLY);
				) {
			stmt.setDouble(1, maxprice);
			rs = stmt.executeQuery();
			Tours.displayData(rs);

		} catch (SQLException e) {
			System.err.println(e);
		}
		finally {
			if (rs != null) rs.close();
		}
	}

}
