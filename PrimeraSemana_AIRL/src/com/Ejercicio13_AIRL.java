/* 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y 
 * lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte en la 
 * bolsa de acuerdo a lo siguiente:
* Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 
*50% al comedor de niños y el resto se invierte en la bolsa.
*Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 
*60% al comedor de niños y el resto se invierte en la bolsa.
*La institución desea saber cuánto de dinero destinará a cada rubro anualmente
*/
package com;

import java.util.Scanner;

public class Ejercicio13_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double donacion, salud, comedor, bolsa;
		
		System.out.print("Ingresa la donacion: ");
		donacion = entrada.nextDouble();
		
		if(donacion >= 10000) {
			salud = donacion * 0.25;
			comedor = donacion *0.6;
			bolsa = donacion - (salud + comedor);
			System.out.println("La cantidad destinada a salud: "+salud);
			System.out.println("La cantidad destinada al comedor es: "+comedor);
			System.out.println("La cantidad destinada a la bolsa es: "+bolsa);
		}else {
			salud = donacion * 0.3;
			comedor = donacion *0.5;
			bolsa = donacion - (salud + comedor);
			System.out.println("La cantidad destinada a salud: "+salud);
			System.out.println("La cantidad destinada al comedor es: "+comedor);
			System.out.println("La cantidad destinada a la bolsa es: "+bolsa);
		}
		

	}

}
