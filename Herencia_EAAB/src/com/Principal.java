package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Persona p1 = new Persona("Juan","masculino",30);
//		
//		System.out.println(p1);
		
//		Empleado empleado1 = new Empleado("Jose","masculino",30,1234,"supervisor","hgdjhwgdh","9 a 6",25000);
//		System.out.println(empleado1);
//		
//		empleado1.checarEntrada();
		
		Developer dev = new Developer("Jose","masculino",30,1234,"supervisor","hgdjhwgdh","9 a 6",25000);
		
		System.out.println(dev);
		
		dev.checarEntrada();
		dev.trabajar();
		
		
	}

}
