package com;

public class Cardio {
	
	
	
	 private String entrenador;
	 private double distancia;
	 private String tiempo;
	 
	public Cardio() {
		
	}
	public Cardio(String entrenador, double distancia, String tiempo) {
		
		this.entrenador = entrenador;
		this.distancia = distancia;
		this.tiempo = tiempo;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	
	@Override
	public String toString() {
		return "Cardio [entrenador=" + entrenador + ", distancia=" + distancia + ", tiempo=" + tiempo + "]";
	}
	 
	 
	 

}
