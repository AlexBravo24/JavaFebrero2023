package com;
//Ejercicio 7

//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
//mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su 
//dinero?

public class Ciclo7_CHC {

	public static void main(String[] args) {
		double dinero=700; //se declara la variable dinero
		int mes=1; //Se representa el inter�s del (2%)
		for(;;) {
			dinero= dinero*1.02;
			if (dinero>= 1500) break;
			mes++;
		}
        System.out.println("En "+mes +
		" meses tendr� m�s de $1500, tendr�: $" + (int)dinero);

	}

}
