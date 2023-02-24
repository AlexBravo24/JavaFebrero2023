package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos una pequeña DB
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		cuentas.put("Aaron", new Cuenta("001",5000,1000,20000,"Debito"));
		cuentas.put("Stephany", new Cuenta("002",2000,1000,30000,"Debito"));
		cuentas.put("Martin", new Cuenta("003",10000,500,50000,"Debito"));
		cuentas.put("Eduardo", new Cuenta("004",500,100,100000,"Debito"));
		
		Cajero cajero = new Cajero("Santa Fe, CDMX", cuentas);
		//probando metodo buscar
//		System.out.println(cajero.buscarCuenta("Aaron"));
//		
//		System.out.println(cajero.buscarCuenta("Gerardo"));
		
		//depositando en cuenta
		System.out.println(cajero.depositar("Aaron", 15000));
		
		//Retirando de cuenta
		System.out.println(cajero.retirar("Aaron", 7000));
		
		//transfiriendo a una cuenta
		System.out.println(cajero.transferir("Aaron", "Martin", 1000));
		System.out.println(cajero.buscarCuenta("Martin"));
	}
}
