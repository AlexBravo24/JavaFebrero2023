package Programas;

//El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//cobrar es la siguiente:
//* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//alumnos.
//Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//pagar cada alumno por el viaje

import java.util.Scanner;

public class Programasiete {
   public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int Numero_alumnos;
	
	System.out.println("Ingresa El Numero De Alumnos :");
	Numero_alumnos = sc.nextInt();
	
	if(Numero_alumnos >= 100)
	{
		System.out.println("Total : "+ Numero_alumnos*65);
	}
	else if(Numero_alumnos >=50 && Numero_alumnos <= 99 )
	{
		System.out.println("Total : "+ Numero_alumnos*70);
	}
	else if(Numero_alumnos >=30 && Numero_alumnos <= 49 )
	{
		System.out.println("Total : "+ Numero_alumnos*95);
	}
	else if(Numero_alumnos >=1 && Numero_alumnos < 30 )
	{
		System.out.println("Total : "+ 4000);
	}
	else
	{
		System.out.println("Datos No Validos");
	}
	
	
	
	   
	   
 }
}
