package com;

import java.util.Scanner;

//EJERCICIO 13
//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//y el resto se invierte en la bolsa.
//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//niños y el resto se invierte en la bolsa.
//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
public class Ejercicio13_CHC {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
	float donacion, salud, comedor, bolsa;
     System.out.println("Ingrese la cantidad recibida de la donación: ");
     donacion=entrada.nextFloat();
     entrada.close();
     
     if (donacion>= 1000) {
    	 salud=donacion*.3f;
    	 comedor=donacion*.5f;
    	 bolsa=donacion*0.2f;
    	 
     }
     else
     {salud= donacion*.25f;
       comedor=donacion*.60f;
       bolsa=donacion*.15f;
     }
 System.out.println("Este año el recurso se destinará \nCentro de Salud-$" +salud
		           +"\nComedor-$" +comedor + "\nbolsa-$" + bolsa);
	
}

}
