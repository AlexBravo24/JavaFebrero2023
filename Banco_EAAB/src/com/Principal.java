package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		// BANCO
		
		// Creamos un nuevo hasmap
		
		HashMap<String,Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		// Agregamos uno a uno varios elementos
		// como los valores de hashmap son del tipo objeto Cuenta
		cuentas.put("Eduardo", new Cuenta("001",10000,3000,30000,"nomina"));
		cuentas.put("Gerardo", new Cuenta("002",5000,500,20000,"debito"));
		cuentas.put("Aaron", new Cuenta("003",7000,3000,30000,"nomina"));
		cuentas.put("Ariana", new Cuenta("004",6000,1000,20000,"debito"));
		cuentas.put("carolina", new Cuenta("005",8500,3000,30000,"nomina"));
		
		// Instanciamos a un cajero
		
		Cajero cajero1 = new Cajero("Xalapa", cuentas);
		
		// consultar informacion de las cuentas
		
		// Consultar una cuenta que existe
		System.out.println(cajero1.buscarCuenta("Ariana"));
		
		// Consultar una cuenta que no existe
		//System.out.println(cajero1.buscarCuenta("Santiago"));
		
		// Probando a realizar un deposito en una cuenta
		
		System.out.println(cajero1.depositar("Ariana", 1500));
		System.out.println(cuentas.get("Ariana").getSaldo());
		
		//Probando retiro de cuenta
		System.out.println(cajero1.retirar("Ariana", 7000));
		System.out.println(cuentas.get("Ariana").getSaldo());
		
		
		//Probando transferencias
		System.out.println(cajero1.transferir("Ariana","Eduardo", 3000));
		System.out.println(cuentas.get("Ariana").getSaldo());
		System.out.println(cuentas.get("Eduardo").getSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
