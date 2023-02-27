package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
           //creamos una bae de datos de las cuentas 
		HashMap<String, Cuenta> cuentas= new HashMap<String, Cuenta>();
		cuentas.put("Aron", new Cuenta("001",5000,1000,20000,"Debito"));
        cuentas.put("Stephany", new Cuenta("002",2000,1000,30000,"Debito"));
        cuentas.put("Marcos", new Cuenta("003",50000,1000,20000,"Debito"));
        cuentas.put("Aron", new Cuenta("004",500,100,20000,"Debito"));
        
        Cajero cajero=new Cajero("Santa fe, CDMX", cuentas);
        System.out.println(cajero.depositar("Aron", 15000));
        
        //System.out.println(cajero.retirar("Aron", 70000));
        //System.out.println(cajero.retirar("Stephany", 1000));
      //  System.out.println(cajero.transferir("Aron", "Stephany", 3000));
        //System.out.println(cajero.buscarCuenta("Stephany"));
	}

}
