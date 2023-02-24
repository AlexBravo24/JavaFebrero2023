package com;

public class Alumno {
	
	//Atributos
	private String nombre;
	private int edad;
	private String pais;
	private String ciudad;
	private String carrera;
	
	
	//Constructores
	public Alumno() {
		
	}

	public Alumno(String nombre, int edad, String pais, String ciudad, String carrera) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
		this.ciudad = ciudad;
		this.carrera = carrera;
	}

	//Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	// toString
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + ", ciudad=" + ciudad + ", carrera="
				+ carrera + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
