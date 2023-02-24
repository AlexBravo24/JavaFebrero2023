package com;

public class Developer extends Empleado {

	private String lenguaje;
	
	

	public Developer(String nombre, String sexo, int edad, int id, String puesto, String rfc, String horario,
		double salario, String lenguaje) {
		super(nombre, sexo, edad, id, puesto, rfc, horario, salario);
		this.setLenguaje(lenguaje);
	}



	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}



	public String getLenguaje() {
		return lenguaje;
	}



	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
	
	
}
