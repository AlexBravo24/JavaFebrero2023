package com;
//EJERCICIO 4
//Dado un array de números de 5 posiciones con los siguientes valores:
//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//los valores invertidos, es decir, que el segundo array deberá tener los valores 
//{5,4,3,2,1}.

public class Array4_CHC {

	public static void main(String[] args) {

   int[] array1= {1,2,3,4,5}; //se hace un array con los valores
   int[] array2= new int [array1.length]; //para el array 2 
   
   for (int i=(array1.length-1),j=0;i>=0;i--,j++) { //De esta manera se invierten los valores del array 1
	   array2[j]=array1[i];
	   System.out.println(array2[j]);
   }
   
   
	}

}
