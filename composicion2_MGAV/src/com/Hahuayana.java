package com;

public class Hahuayana {
	
	private String nombre;
	 private String ingredientes;
	 private double tiempoesspera;
	public Hahuayana() {
	
	}
	public Hahuayana(String nombre, String ingredientes, double tiempoesspera) {
		
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.tiempoesspera = tiempoesspera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public double getTiempoesspera() {
		return tiempoesspera;
	}
	public void setTiempoesspera(double tiempoesspera) {
		this.tiempoesspera = tiempoesspera;
	}
	@Override
	public String toString() {
		return "Hahuayana [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tiempoesspera=" + tiempoesspera
				+ "]";
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
