package Bucles;

import java.util.Scanner;

//.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
//cuando el promedio de las edades sea superior a 25.
public class Programa_Doce {
  public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 float prom=0,edad=0,Operacion=0;
	 int x=0;
	 boolean z = true;
	do {
		x++;
		System.out.println("Ingresa Edad "+x+" :");
		edad = sc.nextInt();
		Operacion = Operacion + edad;
		prom=Operacion / x;
		 if(x > 2 && prom >= 25)
		 {
			 z = false;
		 }
	}while(z == true);
	  System.out.println("Promedio Total : "+Operacion+" / "+x+ " = "+prom);
  }
}
