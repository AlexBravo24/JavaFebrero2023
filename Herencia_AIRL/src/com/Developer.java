package com;

public class Developer extends Empleado{
	
	//si no tengo atributos en la clase que va a heredar de la clase padre puedo generar 
	//los constructores con la ruta source-generate constructors super class



	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String nombre, String sexo, int edad, int idEmpleado, String puesto, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad, idEmpleado, puesto, rfc, horario, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trabajar() {
		System.out.println("Revisar errores");	
	}
	
	

}
