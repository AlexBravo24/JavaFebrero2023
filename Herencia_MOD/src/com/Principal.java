package com;

public class Principal {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Persona persona1 = new Persona("Ana", "Femenino", 28);
//		
//		System.out.println(persona1);
		
//		Empleado empleado1 = new Empleado("Aaron", "Masculino", 30, 12345, "Developer jr","ARR896525T14", "8:00am - 5:00pm", 30000);
//		System.out.println(empleado1);
//		
//		empleado1.checarEntrada();
		Developer desarrollador = new Developer("Aaron", "Masculino", 30, 12345, "Developer jr","ARR896525T14", "8:00am - 5:00pm", 30000);
		System.out.println(desarrollador);
		desarrollador.checarEntrada();
		desarrollador.trabajar();
		
		
	}

}
