package com;
//EJERCICIO 2
//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//1 al 100. Obt�n la suma de todos ellos y la media
public class Array2_CHC {

	public static void main(String[] args) {
		int[] numeros= new int[100];
        int suma=0; //Variable suma
        double media=0; //variable de la media 
        
        
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=i+1;
		suma=suma+numeros[i];
	}
System.out.println("La suma es: " + suma);	
	
media=(double)suma/numeros.length;

System.out.println("La media es: " + media);
	}
	

}
