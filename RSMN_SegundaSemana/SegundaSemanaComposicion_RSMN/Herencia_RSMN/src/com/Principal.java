package com;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona ("ana","femenino",28);
		System.out.println(persona1);
		
//		Empleado empleado1 = new Empleado("aaron", "masculino",30, 12345,
//				"developer jr", "aardsq222","8am-5pm",30000);
//		System.out.println(empleado1);
//		empleado1.checarEntrada();
		
		Developer desarrollador = new Developer("aaron", "masculino",30, 12345,
				"developer jr", "aardsq222","8am-5pm",30000,"java");
		System.out.println(desarrollador);
		
		desarrollador.checarEntrada();
		
	}
}
