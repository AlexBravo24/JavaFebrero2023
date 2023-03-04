package com;

public class Baños {
	
	private String regadera;
	private String tazaBaño;
	private String LavaManos;
	private String azulejoColor;
	
	public Baños() {
	}

	public Baños(String regadera, String tazaBaño, String lavaManos, String azulejoColor) {
		this.regadera = regadera;
		this.tazaBaño = tazaBaño;
		LavaManos = lavaManos;
		this.azulejoColor = azulejoColor;
	}

	public String getRegadera() {
		return regadera;
	}

	public void setRegadera(String regadera) {
		this.regadera = regadera;
	}

	public String getTazaBaño() {
		return tazaBaño;
	}

	public void setTazaBaño(String tazaBaño) {
		this.tazaBaño = tazaBaño;
	}

	public String getLavaManos() {
		return LavaManos;
	}

	public void setLavaManos(String lavaManos) {
		LavaManos = lavaManos;
	}

	public String getAzulejoColor() {
		return azulejoColor;
	}

	public void setAzulejoColor(String azulejoColor) {
		this.azulejoColor = azulejoColor;
	}

	@Override
	public String toString() {
		return "Baños [regadera=" + regadera + ", tazaBaño=" + tazaBaño + ", LavaManos=" + LavaManos + ", azulejoColor="
				+ azulejoColor + "]";
	}

	
	
}
