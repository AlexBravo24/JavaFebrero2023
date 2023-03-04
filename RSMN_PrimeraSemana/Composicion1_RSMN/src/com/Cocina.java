package com;

public class Cocina {

	private String estufaColor;
	private String LavatrastesTamaño;
	private String Alacena;
	
	public Cocina() {
	}

	public Cocina(String estufaColor, String lavatrastesTamaño, String alacena) {
		this.estufaColor = estufaColor;
		LavatrastesTamaño = lavatrastesTamaño;
		Alacena = alacena;
	}

	public String getEstufaColor() {
		return estufaColor;
	}

	public void setEstufaColor(String estufaColor) {
		this.estufaColor = estufaColor;
	}

	public String getLavatrastesTamaño() {
		return LavatrastesTamaño;
	}

	public void setLavatrastesTamaño(String lavatrastesTamaño) {
		LavatrastesTamaño = lavatrastesTamaño;
	}

	public String getAlacena() {
		return Alacena;
	}

	public void setAlacena(String alacena) {
		Alacena = alacena;
	}

	@Override
	public String toString() {
		return "Cocina [estufaColor=" + estufaColor + ", LavatrastesTamaño=" + LavatrastesTamaño + ", Alacena="
				+ Alacena + "]";
	}
	
	
}
