package com;

public class Quirofano {

	private int personal;
	private String planta;
	private int habitaciones;
	private int mesa_operaciones;
	private int lamparas;
	private int bancos;
	
	public Quirofano() {}

	public Quirofano(int personal, String planta, int habitaciones, int mesa_operaciones, int lamparas, int bancos) {
		this.personal = personal;
		this.planta = planta;
		this.habitaciones = habitaciones;
		this.mesa_operaciones = mesa_operaciones;
		this.lamparas = lamparas;
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

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getMesa_operaciones() {
		return mesa_operaciones;
	}

	public void setMesa_operaciones(int mesa_operaciones) {
		this.mesa_operaciones = mesa_operaciones;
	}

	public int getLamparas() {
		return lamparas;
	}

	public void setLamparas(int lamparas) {
		this.lamparas = lamparas;
	}

	public int getBancos() {
		return bancos;
	}

	public void setBancos(int bancos) {
		this.bancos = bancos;
	}

	@Override
	public String toString() {
		return "Quirofano [personal=" + personal + ", planta=" + planta + ", habitaciones=" + habitaciones
				+ ", mesa_operaciones=" + mesa_operaciones + ", lamparas=" + lamparas + ", bancos=" + bancos + "]";
	}
}
