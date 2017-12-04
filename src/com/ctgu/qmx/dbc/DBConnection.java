package com.ctgu.qmx.dbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	private static final String DBDriver = "com.mysql.jdbc.Driver";
	private static final String DBUrl = "jdbc:mysql://localhost:3306/qmxdb?characterEncoding=utf8";
	private static final String dbUser = "root";
	private static final String dbPassword = "123456";
	private Connection conn;

	public DBConnection() {
	try {
		Class.forName(DBDriver);
		conn = DriverManager.getConnection(DBUrl, dbUser, dbPassword);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public Connection getConnection() {
		return this.conn;
	}

	public void close() {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
