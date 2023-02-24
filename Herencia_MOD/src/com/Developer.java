package com;

public class Developer extends Empleado {
	
	//Si no tengo atributos puedo generar los constructores desde la superclass
	


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
