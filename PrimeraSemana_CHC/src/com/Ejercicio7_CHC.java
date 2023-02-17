package com;

import java.util.Scanner;

/*El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
cobrar es la siguiente:
* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
*alumnos.
*Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
*pagar cada alumno por el viaje
 * 
 */

public class Ejercicio7_CHC {

	public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    int numeroAlumnos;
    
    System.out.println("N�mero de alumnos: "); //Para insertar la cantidad de alumnos 
    numeroAlumnos= entrada.nextInt();
    
    //Para realizar el c�lculo se hace lo siguiente:
    if (numeroAlumnos>= 100) { //Se condiciona si el n�mero de alumnos es mayor o igual a 100 (costo 65eu)
    	System.out.println("El pago a la agencia es de: " + numeroAlumnos*65 + " " 
    			            + "euros y cada alumno debe pagar 65 euros");	
    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) { //Si el n�mero de alumnos es entre 50 y 99 (costo de 70eu)
        System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
                + "euros y cada alumno debe pagar 70 euros");

	 } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) { //Si el n�mero de alumnos es de 30 a 49 costo de 95eu
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
	              + "euros y cada alumno debe pagar 95 euros");
	 } else {
	       System.out.println("El coste del autob�s es de 4000 euros y cada alumno " //Si es menor a 30 alumnos
	              + "debe pagar " + (4000/numeroAlumnos) + " euros.");
	        } 

}
}

