package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creamos una pequeña base de datosd de las cuentas

		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		cuentas.put("Aaron", new Cuenta("001", 5000, 1000, 20000, "Debito"));
		cuentas.put("Stephany", new Cuenta("002", 2000, 1000, 30000, "Debito"));
		cuentas.put("Martine", new Cuenta("003", 1000, 5000, 50000, "Debito"));
		cuentas.put("Eduardo", new Cuenta("004", 500, 100, 100000, "Debito"));

		// instanciar un cajero
		Cajero cajero1 = new Cajero("Santa fe, CDMX", cuentas);
//			
//			// consultar informacion de las cuentas (una que si existe)
//			System.out.println(cajero1.buscarCuenta("Eduardo"));
//			
//			//consultando informacion que no existe
//			System.out.println("gerardo");

		// probando a realizar un deposito a una cuenta
		System.out.println(cajero1.depositar("Aaron", 15000));

		// probando un retiro
		System.out.println(cajero1.retirar("Aaron", 7000));
		System.out.println(cajero1.retirar("Stephany", 1000));

		// probando una transferencia
		System.out.println(cajero1.transferir("Aaron", "Stephany", 3000));
		System.out.println(cajero1.buscarCuenta("Stephany"));

	}

}
