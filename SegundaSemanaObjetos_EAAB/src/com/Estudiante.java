package com;

public class Estudiante {
	
	//Atributos
	
	private String nombre;
	private String apellido;
	private String matricula;
	private int edad;
	
	
	//Constructores
	
	public Estudiante() {
	}



	public Estudiante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	//Getters  y Setters
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}


	//toString
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + ", edad=" + edad
				+ "]";
	}
	
	
	
	
	
	

}
