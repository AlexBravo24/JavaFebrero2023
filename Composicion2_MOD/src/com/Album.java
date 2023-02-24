package com;

public class Album {
	private String nombre;
	private String artista;
	private String fecha;
	private String genero;
	
	
	public Album() {
		
	}
	public Album(String nombre, String artista, String fecha, String genero) {
		
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
		this.genero = genero;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Album [nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + ", genero=" + genero + "]";
	}
	
	
	
	
	
}
