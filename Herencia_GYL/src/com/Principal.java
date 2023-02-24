package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Persona persona1 = new Persona("Raul","Masculino", 25);
	System.out.println(persona1);
	Empleado empleado1 = new Empleado("Laura", "Femenino", 27, 12345, 
								"Secretaria", "LAS4758J", "6 AM - 3 PM", 4000);
	System.out.println(empleado1);
	empleado1.checarEntrada();
	}

}
