package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos una pequeña BD, llenar el HashMap
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		cuentas.put("Alma", new Cuenta("123456", 10666, 1000, 20000, "Debito"));
		cuentas.put("Itzel", new Cuenta("123457", 5000, 2000, 25000, "Debito"));
		cuentas.put("Alicia", new Cuenta("123458", 2000, 500, 30000, "Debito"));
		cuentas.put("Mary", new Cuenta("123459", 15000, 1500, 40000, "Debito"));
		
		//Instanciar un Cajero
		Cajero cajero1 = new Cajero("Santa Fe", cuentas);
		
		//Consultar informacion de las cuentas
		//System.out.println(cajero1.buscarCuenta("Alicia"));
		
		//Consultar informacion de una cuenta que no existe
		//System.out.println(cajero1.buscarCuenta("Daniel"));
		
		//Probando realizar un deposito a una cuenta
		System.out.println(cajero1.depositar("Alicia", 27000));
		//Probando un retiro
		System.out.println(cajero1.retirar("Alicia", 1000));
		//Probando una transferencia
		System.out.println(cajero1.transferir("Alma", "Itzel", 666));
		System.out.println(cajero1.buscarCuenta("Alma"));

	}

}
