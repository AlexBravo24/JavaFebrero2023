package com;

public class Developer extends Empleado {

    //Si no tengo atributos en la clase que va a heredar de la
	//vlase padre puedo generar los constructores con la ruta
	//sourse, generate constructors from superclass
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String nombre, String sexo, int edad, String puesto, int idEmpleado, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad, puesto, idEmpleado, rfc, horario, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trabajar() {
		System.out.println("Generar código...");
		
		
	}

}
