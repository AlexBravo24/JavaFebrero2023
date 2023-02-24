package com;

public class Developer extends Empleado {

//Si no tengo atributos en la clase que va a heredar de la clase padre
	//Puedo generar los constructores con la ruta
	//Source, Generate constructors from SuperClass
	
	
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
	// TODO Auto-generated method stub
	System.out.println("Generar código...");
}



}
