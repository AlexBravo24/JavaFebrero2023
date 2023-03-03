package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos una peque�a "base de datos" de las cuentas
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		cuentas.put("Aaron",new Cuenta ("001", 5000, 1000, 20000, "D�bito"));
		cuentas.put("Andr�s",new Cuenta ("028", 7000, 1000, 20000, "D�bito"));
		cuentas.put("Sebasti�n",new Cuenta ("003", 2500, 1000, 20000, "D�bito"));
		cuentas.put("Javier",new Cuenta ("007", 1500, 1000, 20000, "D�bito"));
		
		//Instanciar un cajero
		
		Cajero cajero1 = new Cajero ("Av Vallarta, Zapopan", cuentas);
		
		//consultar informacion de las cuentas
		System.out.println(cajero1.depositar("Andr�s", 3000));
		System.out.println(cajero1.retirar("Sebasti�n", 3000));
		System.out.println(cajero1.transferir("Sebasti�n","Javier", 500));
		System.out.println(cajero1.buscarCuenta("Andr�s"));
	}
}
