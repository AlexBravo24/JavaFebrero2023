package com;

public class Farmacia {

	private int personal;
	private String planta;
	private int mesas;
	private int equipo_computo;
	private int sillas;
	private String medicamento;
	
	public Farmacia() {}

	public Farmacia(int personal, String planta, int mesas, int equipo_computo, int sillas, String medicamento) {
		this.personal = personal;
		this.planta = planta;
		this.mesas = mesas;
		this.equipo_computo = equipo_computo;
		this.sillas = sillas;
		this.medicamento = medicamento;
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

	public int getMesas() {
		return mesas;
	}

	public void setMesas(int mesas) {
		this.mesas = mesas;
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

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public String toString() {
		return "Farmacia [personal=" + personal + ", planta=" + planta + ", mesas=" + mesas + ", equipo_computo="
				+ equipo_computo + ", sillas=" + sillas + ", medicamento=" + medicamento + "]";
	}
	
}
