package com;

import java.util.Scanner;

//EJERCICIO 13
//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//y el resto se invierte en la bolsa.
//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//ni�os y el resto se invierte en la bolsa.
//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
public class Ejercicio13_CHC {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
	float donacion, salud, comedor, bolsa;
     System.out.println("Ingrese la cantidad recibida de la donaci�n: ");
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
 System.out.println("Este a�o el recurso se destinar� \nCentro de Salud-$" +salud
		           +"\nComedor-$" +comedor + "\nbolsa-$" + bolsa);
	
}

}
