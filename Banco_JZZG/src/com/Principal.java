package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
	
		HashMap<String,Cuenta>cuentas =new HashMap<String, Cuenta>();
		
		cuentas.put("zahid",new Cuenta("001",5000,1000,20000,"debito"));
		cuentas.put("jaz",new Cuenta("002",5000,3000,60000,"debito"));
		cuentas.put("yocelin",new Cuenta("003",1000,3000,20000,"debito"));
		cuentas.put("eduardo",new Cuenta("004",2000,4000,20000,"debito"));

		//instanciar un cajero 
		Cajero cajero1 = new Cajero("santa fe ciudad de mexico",cuentas);
		
		System.out.println(cajero1.buscaCuenta("eduardo"));
		System.out.println(cajero1.buscaCuenta("yocelin"));
		
		System.out.println(cajero1.depositar("zahid",8000));
		System.out.println(cajero1.retirar("zahid",6000));
		
		System.out.println(cajero1.transferir("zahid","yocelin",3000));
		System.out.println(cajero1.buscaCuenta("yocelin"));
	}

}
