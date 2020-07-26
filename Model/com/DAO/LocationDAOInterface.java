package com.DAO;

import java.sql.SQLException;

public interface LocationDAOInterface {

	public void addLocationJesen(String nazivLokacije, String opis, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void addLocationLjeto(String nazivLokacije, String opis, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void addLocationProljece(String nazivLokacije, String opis, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void addLocationZima(String nazivLokacije, String opis, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void deleteLocationJesen(String nazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void deleteLocationZima(String nazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void deleteLocationProljece(String nazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void deleteLocationLjeto(String nazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void editLocationJesen(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void editLocationLjeto(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void editLocationProljece(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
	
	public void editLocationZima(String trenutniNazivLokacije, String opis, String noviNazivLokacije, String godisnjeDoba) throws SQLException, ClassNotFoundException;
}
