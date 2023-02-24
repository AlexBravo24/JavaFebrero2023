package com;

public class Laboratorio {

	private int personal;
	private String planta;
	private int mesas;
	private int bancos;
	
	public Laboratorio() {}

	public Laboratorio(int personal, String planta, int mesas, int bancos) {
		this.personal = personal;
		this.planta = planta;
		this.mesas = mesas;
		this.bancos = bancos;
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

	public int getBancos() {
		return bancos;
	}

	public void setBancos(int bancos) {
		this.bancos = bancos;
	}

	@Override
	public String toString() {
		return "Laboratorio [personal=" + personal + ", planta=" + planta + ", mesas=" + mesas + ", bancos=" + bancos
				+ "]";
	}
}
