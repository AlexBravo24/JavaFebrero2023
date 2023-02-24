package com;

public class Tecnico {
	private String nombre;
	private String sexo;
	private int edad;
	private String nacionalidad;
	private int no_titulos;
	
	public Tecnico() {
		
	}

	public Tecnico(String nombre, String sexo, int edad, String nacionalidad, int no_titulos) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.no_titulos = no_titulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getNo_titulos() {
		return no_titulos;
	}

	public void setNo_titulos(int no_titulos) {
		this.no_titulos = no_titulos;
	}

	@Override
	public String toString() {
		return "Tecnico [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", nacionalidad=" + nacionalidad
				+ ", no_titulos=" + no_titulos + "]";
	}
	
		

}
