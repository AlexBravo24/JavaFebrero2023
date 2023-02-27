package com;

public class Nutricion {
	
	 private String entrenador;
	 private double calorias;
	 private int comidas;
	public Nutricion() {
		
	}
	public Nutricion(String entrenador, double calorias, int comidas) {
	
		this.entrenador = entrenador;
		this.calorias = calorias;
		this.comidas = comidas;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public int getComidas() {
		return comidas;
	}
	public void setComidas(int comidas) {
		this.comidas = comidas;
	}
	@Override
	public String toString() {
		return "Nutricion [entrenador=" + entrenador + ", calorias=" + calorias + ", comidas=" + comidas + "]";
	}
	 
	 

}
