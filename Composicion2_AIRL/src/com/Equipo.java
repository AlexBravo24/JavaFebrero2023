package com;

public class Equipo {
	private String nombre;	
	private int puntos;
	private int posicion_gen;
	private int plantel;
	private int no_campeonatos;
	
	private Estadio estadio;
	private Tecnico tecnico;
	
	public Equipo() {
		
	}

	public Equipo(String nombre, int puntos, int posicion_gen, int plantel, int no_campeonatos, Estadio estadio,
			Tecnico tecnico) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.posicion_gen = posicion_gen;
		this.plantel = plantel;
		this.no_campeonatos = no_campeonatos;
		this.estadio = estadio;
		this.tecnico = tecnico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPosicion_gen() {
		return posicion_gen;
	}

	public void setPosicion_gen(int posicion_gen) {
		this.posicion_gen = posicion_gen;
	}

	public int getPlantel() {
		return plantel;
	}

	public void setPlantel(int plantel) {
		this.plantel = plantel;
	}

	public int getNo_campeonatos() {
		return no_campeonatos;
	}

	public void setNo_campeonatos(int no_campeonatos) {
		this.no_campeonatos = no_campeonatos;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", posicion_gen=" + posicion_gen + ", plantel="
				+ plantel + ", no_campeonatos=" + no_campeonatos + ", \nestadio=" + estadio + ", \ntecnico=" + tecnico
				+ "]";
	}

	
	
	

}
