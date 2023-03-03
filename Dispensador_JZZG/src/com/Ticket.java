package com;

public class Ticket {

	
	private int folio;
	private String nombredulce;
	private double costo;
	
	public Ticket(){}

	public Ticket(int folio, String nombredulce, double costo) {
		
		this.folio = folio;
		this.nombredulce = nombredulce;
		this.costo = costo;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public String getNombredulce() {
		return nombredulce;
	}

	public void setNombredulce(String nombredulce) {
		this.nombredulce = nombredulce;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", nombredulce=" + nombredulce + ", costo=" + costo + "]";
	}
	
	
	
}
