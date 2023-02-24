package com;

public class Hospital {

	private String nombre;
	private String lugar;
	private String habitaciones;
	private int personal_medico;
	private int ambulancias;
	
	public Quirofano quirofano;
	public Cuidados_Intensivos cuidados_intensivos;
	public Farmacia farmacia;
	public Laboratorio laboratorio;
	public Radiologia radiologia;

	public Hospital() {}

	public Hospital(String nombre, String lugar, String habitaciones, int personal_medico, int ambulancias,
			Quirofano quirofano, Cuidados_Intensivos cuidados_intensivos, Farmacia farmacia, Laboratorio laboratorio,
			Radiologia radiologia) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.habitaciones = habitaciones;
		this.personal_medico = personal_medico;
		this.ambulancias = ambulancias;
		this.quirofano = quirofano;
		this.cuidados_intensivos = cuidados_intensivos;
		this.farmacia = farmacia;
		this.laboratorio = laboratorio;
		this.radiologia = radiologia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(String habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getPersonal_medico() {
		return personal_medico;
	}

	public void setPersonal_medico(int personal_medico) {
		this.personal_medico = personal_medico;
	}

	public int getAmbulancias() {
		return ambulancias;
	}

	public void setAmbulancias(int ambulancias) {
		this.ambulancias = ambulancias;
	}

	public Quirofano getQuirofano() {
		return quirofano;
	}

	public void setQuirofano(Quirofano quirofano) {
		this.quirofano = quirofano;
	}

	public Cuidados_Intensivos getCuidados_intensivos() {
		return cuidados_intensivos;
	}

	public void setCuidados_intensivos(Cuidados_Intensivos cuidados_intensivos) {
		this.cuidados_intensivos = cuidados_intensivos;
	}

	public Farmacia getFarmacia() {
		return farmacia;
	}

	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Radiologia getRadiologia() {
		return radiologia;
	}

	public void setRadiologia(Radiologia radiologia) {
		this.radiologia = radiologia;
	}

	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", lugar=" + lugar + ", habitaciones=" + habitaciones
				+ ", personal_medico=" + personal_medico + ", ambulancias=" + ambulancias + ", quirofano=" + quirofano
				+ ", cuidados_intensivos=" + cuidados_intensivos + ", farmacia=" + farmacia + ", laboratorio="
				+ laboratorio + ", radiologia=" + radiologia + "]";
	}
}
