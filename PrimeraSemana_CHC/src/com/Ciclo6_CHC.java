package com;
//EJERCICIO 6

//- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
//todo el dinero lo reinvierte?

public class Ciclo6_CHC {

	public static void main(String[] args) {
		double dinero = 1000; //El dinero a invertir
		int mes = 1; //Ya que es 2-1
		 
		while (mes<=12) { //Es a un año, por eso se coloca 12 meses 
			dinero=dinero*1.02;//Operación del dinero 
			mes++;
		}
		System.out.printf("El dinero ahorrado es: $" + (int)dinero);


	}

}
