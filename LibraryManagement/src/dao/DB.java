package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getCon() {
		String DB_URL = "jdbc:mysql://localhost:3306/testdb";
		String USER_NAME = "root";
		String PASSWORD = "123456789";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return con;
	}
}
