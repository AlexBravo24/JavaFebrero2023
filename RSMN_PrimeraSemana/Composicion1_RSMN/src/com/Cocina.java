package com;

public class Cocina {

	private String estufaColor;
	private String LavatrastesTamaņo;
	private String Alacena;
	
	public Cocina() {
	}

	public Cocina(String estufaColor, String lavatrastesTamaņo, String alacena) {
		this.estufaColor = estufaColor;
		LavatrastesTamaņo = lavatrastesTamaņo;
		Alacena = alacena;
	}

	public String getEstufaColor() {
		return estufaColor;
	}

	public void setEstufaColor(String estufaColor) {
		this.estufaColor = estufaColor;
	}

	public String getLavatrastesTamaņo() {
		return LavatrastesTamaņo;
	}

	public void setLavatrastesTamaņo(String lavatrastesTamaņo) {
		LavatrastesTamaņo = lavatrastesTamaņo;
	}

	public String getAlacena() {
		return Alacena;
	}

	public void setAlacena(String alacena) {
		Alacena = alacena;
	}

	@Override
	public String toString() {
		return "Cocina [estufaColor=" + estufaColor + ", LavatrastesTamaņo=" + LavatrastesTamaņo + ", Alacena="
				+ Alacena + "]";
	}
	
	
}
