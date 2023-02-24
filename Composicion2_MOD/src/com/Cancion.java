package com;

public class Cancion {
	private String nombre;
	private String duracion;
	private String productor;
	
	private Autor autor;
	private Album album;
	public Cancion() {
		
	}
	public Cancion(String nombre,  String duracion, String productor, Autor autor, Album album) {
		
		this.nombre = nombre;
		this.duracion = duracion;
		this.productor = productor;
		this.autor = autor;
		this.album = album;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", duracion=" + duracion + ", productor="
				+ productor + ", \nautor=" + autor + ", \nalbum=" + album + "]";
	}
	
	
	
}
