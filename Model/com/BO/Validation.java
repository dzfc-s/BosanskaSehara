package com.BO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DAO.ConnectionManager;

public class Validation {
	
	public static boolean nazivLokacijeLjetoValidation(String nazivLokacije) throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "SELECT * FROM ljeto WHERE nazivLokacije = ?";
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, nazivLokacije);
			rs = statement.executeQuery();
			
			return rs.next();
		}	
	}
	
	public static boolean nazivLokacijeJesenValidation(String nazivLokacije) throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "SELECT * FROM jesen WHERE nazivLokacije = ?";
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, nazivLokacije);
			rs = statement.executeQuery();
			
			return rs.next();
		}	
	}
	
	public static boolean nazivLokacijeZimaValidation(String nazivLokacije) throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "SELECT * FROM zima WHERE nazivLokacije = ?";
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, nazivLokacije);
			rs = statement.executeQuery();
			
			return rs.next();
		}	
	}
	
	public static boolean nazivLokacijeProljeceValidation(String nazivLokacije) throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "SELECT * FROM proljece WHERE nazivLokacije = ?";
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, nazivLokacije);
			rs = statement.executeQuery();
			
			return rs.next();
		}	
	}
	
}
