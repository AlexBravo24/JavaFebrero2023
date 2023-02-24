package com;

public class Array {
	
	public static void main (String[] args) {
		
		
		char [] nombre = new char[6];
		
		
		nombre [0]= 'A';
		nombre [1]='N';
		nombre [2]= 'D';
		nombre [3]= 'R';
		nombre [4]= 'E';
		nombre [5]= 'S';
		
//		System.out.println(nombre[4]);
		
	
	char [] nombre2 = {'A', 'n', 'd', 'y'}; //Tenemos un array declarado con su longitud y los valores
	                                      // que tiene en cada posición
	
	int [] numeros = {1,2,3,4,5};
	
	String [] nombres = {"Andrés", "Sebastián", "Javier"};
	
	boolean [] valor = {true, false, true , false};
	
	
	System.out.println( nombres[2]);
	
	for(int i=0; i<nombre2.length;i++ ) {
		System.out.print(nombre2[i]);
		
	}	
	
	//Imprimir en pantalla los valores del array con un ciclo for each
	
	for (int i:numeros) {
		System.out.println(i);
	
	
		
	
	
		
		
		
		
	}
	
	
	
	
	
	
	
  }
	
	

}
