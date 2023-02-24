package com;

public class Radiologia {

	private int personal;
	private String planta;
	private int computadoras;
	private int camilla;
	
	public Radiologia() {}

	public Radiologia(int personal, String planta, int computadoras, int camilla) {
		this.personal = personal;
		this.planta = planta;
		this.computadoras = computadoras;
		this.camilla = camilla;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public int getComputadoras() {
		return computadoras;
	}

	public void setComputadoras(int computadoras) {
		this.computadoras = computadoras;
	}

	public int getCamilla() {
		return camilla;
	}

	public void setCamilla(int camilla) {
		this.camilla = camilla;
	}

	@Override
	public String toString() {
		return "Radiologia [personal=" + personal + ", planta=" + planta + ", computadoras=" + computadoras
				+ ", camilla=" + camilla + "]";
	}
	
}
