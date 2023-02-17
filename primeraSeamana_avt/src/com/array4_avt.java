package com;

public class array4_avt {

	public static void main(String[] args) {
		
		    int[] numeros ={1,2,3,4,5};
		    int longitud=0;
	        longitud = numeros.length;
	        //imprimimos el array de partida
	        System.out.println("Array inicial: ");
	        for (int i=0; i<longitud;i++){
	            System.out.print (numeros[i]+" - ");
	        }
	        System.out.println("\n");
	        //Array invertido: imprimiento el array de atras a adelante
	        System.out.println("Array invertido: ");
	        for (int i=longitud-1; i>=0;i--){
	            System.out.print (numeros[i]+" - ");
	        }
	      
	    }
	}


