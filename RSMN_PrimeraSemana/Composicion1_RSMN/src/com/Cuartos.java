package com;

public class Cuartos {
	
	private String cama;
	private String closet;
	private String buros;
	
	public Cuartos() {
	}

	public Cuartos(String cama, String closet, String buros) {
		this.cama = cama;
		this.closet = closet;
		this.buros = buros;
	}

	public String getCama() {
		return cama;
	}

	public void setCama(String cama) {
		this.cama = cama;
	}

	public String getCloset() {
		return closet;
	}

	public void setCloset(String closet) {
		this.closet = closet;
	}

	public String getBuros() {
		return buros;
	}

	public void setBuros(String buros) {
		this.buros = buros;
	}

	@Override
	public String toString() {
		return "Cuartos [cama=" + cama + ", closet=" + closet + ", buros=" + buros + "]";
	}
	
	
	

}
