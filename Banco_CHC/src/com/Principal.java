package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//Creamos una pequeña "base de datos" de las cuentas
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta> () ;
		
		
		cuentas.put("Carol", new Cuenta("001", 5000,1000, 20000,"Débito"));
		cuentas.put("Stephany", new Cuenta("002", 20000,1000, 30000,"Débito"));
		cuentas.put("Saúl", new Cuenta("003", 10000,500, 50000,"Débito"));
		cuentas.put("Eduardo", new Cuenta("004", 500,100, 100000,"Débito"));
		
	
	//Instanciamos un cajero 
	
	Cajero cajero1= new Cajero ("Santa Fé, CDMX", cuentas);
	//consultar la información de las cuentas
	//System.out.println(cajero1.buscarCuenta("Carol"));
	
	//Consultando informaci+pm de una cuenta que no existe
	//System.out.println(cajero1.buscarCuenta("Jerry"));
	
	
	//Probamos a realizar un deposito en una cuenta
	System.out.println(cajero1.depositar("Carol",15000));
	//Probando un retiro de una cuenta
	System.out.println(cajero1.retirar("Carol", 7000));
	System.out.println(cajero1.retirar("Stephany",1000));
	
	//Probando una transferencia
	
	System.out.println(cajero1.transferir("Carol", "Stephany", 3000));
	System.out.println(cajero1.buscarCuenta("Stephany"));
	}
	//Ejercicio de simular una máquina expendedora de refrescos o de dulces
	//Buscamos un producto por un código ("llave")
	//Maquina, Productos
	//Retiro o despacho del producto 

}
