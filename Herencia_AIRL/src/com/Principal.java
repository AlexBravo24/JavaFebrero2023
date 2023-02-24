package com;

public class Principal {

	public static void main(String[] args) {
		
//		Empleado empleado1 = new Empleado("Alma", "Femenino", 26, 12312, "Dev", "rala9601", "8-5", 15000);
//        System.out.println(empleado1);
//        empleado1.checarEntrada();
		
		Developer desarrollador = new Developer ("Alma", "Femenino", 26, 12312, "Dev jr", "rala9601", "8-5", 15000);
		System.out.println(desarrollador);
		desarrollador.checarEntrada();
		desarrollador.trabajar();
		
	}

}
