package com;

public class Developer extends Empleado{
	
	



	//si no tengo atributos en la clase hija 
	//puedo generar los constructores desde 
	// generate constructors from superclass

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String nombre, String sexo, int edad, int idEmpleado, String puesto, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad, idEmpleado, puesto, rfc, horario, salario);
		// TODO Auto-generated constructor stub
	}

	
	
	//Se sobrescribe el metodo que era abstracto para su implementacion
	@Override
	public void trabajar() {
		
		System.out.println("Trabajando...");
		
	}
	
	
	

}
