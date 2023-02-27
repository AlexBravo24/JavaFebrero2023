package com;

public class Fuerza {
	
	 private String entrenador;
	 private double peso;
	 private int repeticion;
	public Fuerza() {
		
	}
	public Fuerza(String entrenador, double peso, int repeticion) {
		
		this.entrenador = entrenador;
		this.peso = peso;
		this.repeticion = repeticion;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getRepeticion() {
		return repeticion;
	}
	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}
	@Override
	public String toString() {
		return "Fuerza [entrenador=" + entrenador + ", peso=" + peso + ", repeticion=" + repeticion + "]";
	}
	 
	 
	 

}
