package com;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona1= new Persona ("Andrés", "Masculino", 25);
		System.out.println (persona1);
		
//		Empleado empleado1 = new Empleado ("Sebastian", "Masculino", 19,"Developer Jr",12345,
//				"SVC081103","8am-5pm",30000);
//         System.out.println (empleado1);		
//         empleado1.checarEntrada();
	
	Developer desarrollador = new Developer ("Sebastian", "Masculino", 19,"Developer Jr",12345,
         		"SVC081103","8am-5pm",30000);
	System.out.println(desarrollador);
	
	desarrollador.checarEntrada();
	desarrollador.trabajar();
	
	
	
	}
	
	
	
}
