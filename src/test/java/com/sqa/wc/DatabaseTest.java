package com.sqa.wc;

import java.sql.*;

import org.testng.annotations.*;

public class DatabaseTest {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbconn = DriverManager.getConnection("jdbc:mysql://localhost:8889/sqadb", "root", "root");
		Statement stmt = dbconn.createStatement();
		ResultSet rs = stmt.executeQuery("select id, username, password from user");
		while (rs.next()) {
			int id = rs.getInt(1);
			String userName = rs.getString(2);
			String userPass = rs.getString(3);

			System.out.println(id + " user =" + userName + " password=" + userPass);
		}
		rs.close();
		stmt.close();
		dbconn.close();
	}

}
