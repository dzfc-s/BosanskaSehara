package com.DTO;

public class Location {
	
	private String nazivLokacije;
	private String opis;
	private String godisnjeDoba;
	
	public Location() {
		
	}
	
	public Location(String nazivLokacije, String opis, String godisnjeDoba) {
		this.nazivLokacije = nazivLokacije;
		this.opis = opis;
		this.godisnjeDoba = godisnjeDoba;
	}

	public String getNazivLokacije() {
		return nazivLokacije;
	}

	public void setNazivLokacije(String nazivLokacije) {
		this.nazivLokacije = nazivLokacije;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getGodisnjeDoba() {
		return godisnjeDoba;
	}

	public void setGodisnjeDoba(String godisnjeDoba) {
		this.godisnjeDoba = godisnjeDoba;
	}
	
}
	
