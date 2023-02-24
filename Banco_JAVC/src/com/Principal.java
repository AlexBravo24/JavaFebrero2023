package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos una pequeña "base de datos" de las cuentas
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		cuentas.put("Aaron",new Cuenta ("001", 5000, 1000, 20000, "Débito"));
		cuentas.put("Andrés",new Cuenta ("028", 7000, 1000, 20000, "Débito"));
		cuentas.put("Sebastián",new Cuenta ("003", 2500, 1000, 20000, "Débito"));
		cuentas.put("Javier",new Cuenta ("007", 1500, 1000, 20000, "Débito"));
		
		//Instanciar un cajero
		
		Cajero cajero1 = new Cajero ("Av Vallarta, Zapopan", cuentas);
		
		//consultar informacion de las cuentas
		System.out.println(cajero1.depositar("Andrés", 3000));
		System.out.println(cajero1.retirar("Sebastián", 3000));
		System.out.println(cajero1.transferir("Sebastián","Javier", 500));
		System.out.println(cajero1.buscarCuenta("Andrés"));
	}
}
