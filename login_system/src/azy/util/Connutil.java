package azy.util;

import java.util.Properties;
import java.io.*;
import java.sql.*;

public class Connutil {
	private static String DRIVER;
	private static String URL;
	private static String NAME;
	private static String PASSWORD;
	private static Connection conn;

	public static Connection getConn() {
		try {
			Properties p = new Properties();
			InputStream file = Connutil.class.getResourceAsStream("jdbc.properties");
			p.load(file);
			DRIVER = p.getProperty("driver");
			URL = p.getProperty("url");
			NAME = p.getProperty("name");
			PASSWORD = p.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
