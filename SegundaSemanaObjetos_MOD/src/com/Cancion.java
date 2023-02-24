package com;

public class Cancion {
	
	private String nombre;
	private String cantante;
	private int a�o;
	private String genero;
	
	
	public Cancion() {
		
	}
	public Cancion(String nombre, String cantante, int a�o, String genero) {
		
		this.nombre = nombre;
		this.cantante = cantante;
		this.a�o = a�o;
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
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + cantante + ", a�o=" + a�o + ", genero=" + genero + "]";
	}
	
	
	
}
