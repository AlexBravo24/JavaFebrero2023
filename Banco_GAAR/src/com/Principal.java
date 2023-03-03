package com;

import java.util.HashMap;

public class Principal {
		
	public static void main(String[] args) {
	
	 
		//Creamos una pequeña base de datos de las cuentas 
        HashMap<String, Cuenta> cuentas = new HashMap<String,Cuenta>();
        
		cuentas.put("Aroon", new Cuenta("001",5000,1000,20000,"debito"));
		cuentas.put("Estefany", new Cuenta("002",6000,1000,30000,"debito"));
		cuentas.put("Zahid", new Cuenta("003",4000,1000,50000,"debito"));
		cuentas.put("Jose ", new Cuenta("004",2000,1000,70000,"debito"));
		
		//instanciar un cajero 
		Cajero cajero1 = new Cajero("Santa Fe, CDMX",cuentas);
	
	//Consultar informacion de las cuentas 
		//System.out.println(cajero1.BuscarCuenta("Aroon"));
	
	//Probando a realizar un deposito en una cuenta
		System.out.println(cajero1.Depositar("Aroon", 15000));
	
		//probando retiro de una cuenta 
		System.out.println(cajero1.Retirar("Aroon", 4000));
		
		//Metodo de transferencia
		System.out.println(cajero1.Transferencia("Aroon", "Estefany", 3000));
		System.out.println(cajero1.BuscarCuenta("Estefany"));
		
		
		//EJERCICIO SIMULAR UNA MAQUINA EXPENDEDORA DE REFRESCOS
		//Buscamos producto
		//Retiro del producto, despachar
		//ingresar dinero
		
	}
		
}
