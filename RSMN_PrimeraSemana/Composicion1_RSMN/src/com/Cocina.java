package com;

public class Cocina {

	private String estufaColor;
	private String LavatrastesTama�o;
	private String Alacena;
	
	public Cocina() {
	}

	public Cocina(String estufaColor, String lavatrastesTama�o, String alacena) {
		this.estufaColor = estufaColor;
		LavatrastesTama�o = lavatrastesTama�o;
		Alacena = alacena;
	}

	public String getEstufaColor() {
		return estufaColor;
	}

	public void setEstufaColor(String estufaColor) {
		this.estufaColor = estufaColor;
	}

	public String getLavatrastesTama�o() {
		return LavatrastesTama�o;
	}

	public void setLavatrastesTama�o(String lavatrastesTama�o) {
		LavatrastesTama�o = lavatrastesTama�o;
	}

	public String getAlacena() {
		return Alacena;
	}

	public void setAlacena(String alacena) {
		Alacena = alacena;
	}

	@Override
	public String toString() {
		return "Cocina [estufaColor=" + estufaColor + ", LavatrastesTama�o=" + LavatrastesTama�o + ", Alacena="
				+ Alacena + "]";
	}
	
	
}
