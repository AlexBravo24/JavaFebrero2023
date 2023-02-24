package com;

public class Comida {
	private String origen;
	private String ingred_principal;
	private double costo;
	
	public Comida() {
		
	}

	public Comida(String origen, String ingred_principal, double costo) {
		
		this.origen = origen;
		this.ingred_principal = ingred_principal;
		this.costo = costo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getIngred_principal() {
		return ingred_principal;
	}

	public void setIngred_principal(String ingred_principal) {
		this.ingred_principal = ingred_principal;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Comida [origen=" + origen + ", ingred_principal=" + ingred_principal + ", costo=" + costo + "]";
	}
	
	
	

}
