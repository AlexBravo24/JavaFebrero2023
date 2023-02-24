package com;

public class Ciclos7_JCCD {
	
	public static void main(String[] args) {
		//Ejercicio Ciclos 6
		//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		//dinero?
		
		double deposito = 700;
		int mes = 1;
		
		for (;;) {
			
			deposito = deposito*1.02;
			
			if (deposito>=1500) break;
			
			mes++;
		}
		System.out.printf("En el mes " + mes + " conseguiste " + "%.2f",deposito);
		
	}

}
