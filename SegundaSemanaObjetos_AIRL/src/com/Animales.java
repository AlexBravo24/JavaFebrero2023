package com;

public class Animales {
	private String especie;
	private String nombre;
	private String color;
	private String sexo;
	private int edad;
	
	public Animales() {
		
	}

	public Animales(String especie, String nombre, String color, String sexo, int edad) {
		
		this.especie = especie;
		this.nombre = nombre;
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animales [especie=" + especie + ", nombre=" + nombre + ", color=" + color + ", sexo=" + sexo + ", edad="
				+ edad + "]";
	}
	
	
	
	

}
