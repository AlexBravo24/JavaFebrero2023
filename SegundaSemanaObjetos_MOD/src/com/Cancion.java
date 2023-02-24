package com;

public class Cancion {
	
	private String nombre;
	private String cantante;
	private int año;
	private String genero;
	
	
	public Cancion() {
		
	}
	public Cancion(String nombre, String cantante, int año, String genero) {
		
		this.nombre = nombre;
		this.cantante = cantante;
		this.año = año;
		this.genero = genero;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + cantante + ", año=" + año + ", genero=" + genero + "]";
	}
	
	
	
}
