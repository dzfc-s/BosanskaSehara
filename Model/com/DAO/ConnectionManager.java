package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static ConnectionManager instance = null;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "BlackRoses23";
	private static final String CONN_STRING = "jdbc:mysql://localhost:3306/bosanskasehara?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
	private Connection connection = null;
	
	private ConnectionManager() throws ClassNotFoundException {

	}

	public static ConnectionManager getInstance() throws ClassNotFoundException {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}

	private boolean openConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

	public Connection getConnection() throws ClassNotFoundException {
		if (connection == null) {
			if (openConnection()) {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Konekcija otvorena.");
				return connection;
			} else {
				return null;
			}
		}
		return connection;
	}

	public void close() throws ClassNotFoundException {
		System.out.println("Konekcija zatvorena.");
		try {
			connection.close();
			connection = null;
		} catch (Exception e) {
		}
	}
}