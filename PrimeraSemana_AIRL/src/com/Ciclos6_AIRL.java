/*6.- Una persona desea invertir $1000.00 en un banco, 
 * el cual le otorga un 2% de interés mensual.
 *  ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo 
 *  de un año si todo el dinero lo reinvierte?
 */
package com;

public class Ciclos6_AIRL {

	public static void main(String[] args) {
		
		float dineroInv = 1000f, Anual;
		
		Anual = ((dineroInv * .02f)*12)+dineroInv;
		System.out.println("La cantidad de dinero es de: $"+Anual);

	}

}
