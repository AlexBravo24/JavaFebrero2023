package com;

public class Ba�os {
	
	private String regadera;
	private String tazaBa�o;
	private String LavaManos;
	private String azulejoColor;
	
	public Ba�os() {
	}

	public Ba�os(String regadera, String tazaBa�o, String lavaManos, String azulejoColor) {
		this.regadera = regadera;
		this.tazaBa�o = tazaBa�o;
		LavaManos = lavaManos;
		this.azulejoColor = azulejoColor;
	}

	public String getRegadera() {
		return regadera;
	}

	public void setRegadera(String regadera) {
		this.regadera = regadera;
	}

	public String getTazaBa�o() {
		return tazaBa�o;
	}

	public void setTazaBa�o(String tazaBa�o) {
		this.tazaBa�o = tazaBa�o;
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
		return "Ba�os [regadera=" + regadera + ", tazaBa�o=" + tazaBa�o + ", LavaManos=" + LavaManos + ", azulejoColor="
				+ azulejoColor + "]";
	}

	
	
}
