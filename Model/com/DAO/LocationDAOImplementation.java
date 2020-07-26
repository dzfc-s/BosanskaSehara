package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationDAOImplementation implements LocationDAOInterface {
	
	@Override
	public void addLocationJesen(String nazivLokacije, String opis, String godisnjeDoba) throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "INSERT INTO jesen(nazivLokacije, opis) VALUES(?, ?)";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, nazivLokacije);
			statement.setString(2, opis);
			statement.executeUpdate();	
		} catch (Exception e) {
		}	
	}

	@Override
	public void addLocationLjeto(String nazivLokacije, String opis, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {

		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "INSERT INTO ljeto(nazivLokacije, opis) VALUES(?, ?)";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, nazivLokacije);
			statement.setString(2, opis);
			statement.executeUpdate();	
		} catch (Exception e) {
		} 	
	}

	@Override
	public void addLocationProljece(String nazivLokacije, String opis, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {

		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "INSERT INTO proljece(nazivLokacije, opis) VALUES(?, ?)";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, nazivLokacije);
			statement.setString(2, opis);
			statement.executeUpdate();	
		} catch (Exception e) {
		} 
	}

	@Override
	public void addLocationZima(String nazivLokacije, String opis, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {

		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "INSERT INTO zima(nazivLokacije, opis) VALUES(?, ?)";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, nazivLokacije);
			statement.setString(2, opis);
			statement.executeUpdate();	
		} catch (Exception e) {
		} 
	}

	@Override
	public void editLocationJesen(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "UPDATE jesen SET nazivLokacije = ? WHERE nazivLokacije = ?";
		String query2 = "UPDATE jesen SET opis = ? WHERE nazivLokacije = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
					
					statement.setString(1, noviNazivLokacije);
					statement.setString(2, trenutniNazivLokacije);
			
					statement.executeUpdate();
		}	
			
		try (PreparedStatement statement = connection.prepareStatement(query2);) {
			
			statement.setString(1, opis);
			statement.setString(2, noviNazivLokacije);
	
			statement.executeUpdate();
		}	
	}

	@Override
	public void editLocationLjeto(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "UPDATE ljeto SET nazivLokacije = ? WHERE nazivLokacije = ?";
		String query2 = "UPDATE ljeto SET opis = ? WHERE nazivLokacije = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
					
					statement.setString(1, noviNazivLokacije);
					statement.setString(2, trenutniNazivLokacije);
			
					statement.executeUpdate();
		}	
			
		try (PreparedStatement statement = connection.prepareStatement(query2);) {
			
			statement.setString(1, opis);
			statement.setString(2, noviNazivLokacije);
	
			statement.executeUpdate();
		}	
		
	}

	@Override
	public void editLocationProljece(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "UPDATE proljece SET nazivLokacije = ? WHERE nazivLokacije = ?";
		String query2 = "UPDATE proljece SET opis = ? WHERE nazivLokacije = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
					
			statement.setString(1, noviNazivLokacije);
			statement.setString(2, trenutniNazivLokacije);
			statement.executeUpdate();
		}	
			
		try (PreparedStatement statement = connection.prepareStatement(query2);) {
			
			statement.setString(1, opis);
			statement.setString(2, noviNazivLokacije);
			statement.executeUpdate();
		}	
		
	}

	@Override
	public void editLocationZima(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "UPDATE zima SET nazivLokacije = ? WHERE nazivLokacije = ?";
		String query2 = "UPDATE zima SET opis = ? WHERE nazivLokacije = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
					
			statement.setString(1, noviNazivLokacije);
			statement.setString(2, trenutniNazivLokacije);
			statement.executeUpdate();
		}	
			
		try (PreparedStatement statement = connection.prepareStatement(query2);) {
			
			statement.setString(1, opis);
			statement.setString(2, noviNazivLokacije);
			statement.executeUpdate();
		}	
		
	}

	@Override
	public void deleteLocationJesen(String nazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		
		Connection connection = ConnectionManager.getInstance().getConnection();
		
		String query = "SELECT id FROM jesen WHERE nazivLokacije= ?";
		String query2 = "DELETE FROM jesen WHERE id= ?";
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, nazivLokacije);
			rs = statement.executeQuery();
		
			try (PreparedStatement statement2 = connection.prepareStatement(query2);) {
				statement2.setString(1, rs.toString());
			}
		}

		rs.close();
	}

	@Override
	public void deleteLocationZima(String nazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLocationProljece(String nazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLocationLjeto(String nazivLokacije, String godisnjeDoba)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
