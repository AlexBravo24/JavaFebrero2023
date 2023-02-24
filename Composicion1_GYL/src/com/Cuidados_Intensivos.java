package com;

public class Cuidados_Intensivos {

	private int personal;
	private String planta;
	private int equipo_computo;
	private int sillas;
	
	public Cuidados_Intensivos () {}

	public Cuidados_Intensivos(int personal, String planta, int equipo_computo, int sillas) {
		this.personal = personal;
		this.planta = planta;
		this.equipo_computo = equipo_computo;
		this.sillas = sillas;
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

	public int getEquipo_computo() {
		return equipo_computo;
	}

	public void setEquipo_computo(int equipo_computo) {
		this.equipo_computo = equipo_computo;
	}

	public int getSillas() {
		return sillas;
	}

	public void setSillas(int sillas) {
		this.sillas = sillas;
	}

	@Override
	public String toString() {
		return "Cuidados_Intensivos [personal=" + personal + ", planta=" + planta + ", equipo_computo=" + equipo_computo
				+ ", sillas=" + sillas + "]";
	}
}
