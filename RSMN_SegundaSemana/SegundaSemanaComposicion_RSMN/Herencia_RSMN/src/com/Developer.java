package com;

public class Developer extends Empleado  {
	
	// si no tengo la atributos en la clase que va a heredar de la clase padre
	// puedo generar la ruta  
	
	private String lenguaje;

	
	

	public Developer(String nombre, String sexo, int edad, int idEmpleado, String puesto, String rfc, String horario,
			double salario, String lenguaje) {
		super(nombre, sexo, edad, idEmpleado, puesto, rfc, horario, salario);
		this.lenguaje = lenguaje;
	}




	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("generar codigo");
		
	}
	

	
}
