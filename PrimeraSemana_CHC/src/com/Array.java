package com;

public class Array {

	public static void main(String[] args) {
		// Son una estructura de datos en com�n que almacenan 
    // y una vez declarado su tama�o o longitud este no puede
		//crecer o cambiar 
		
		
		
		char[] nombre = new char[6]; //Un array de caracteres con su tama�o declarado
		//en los corchetes declaro la longitud o tama�o del Array
		
		//Asignando datos o valores a cada posici�n del array
		
		nombre[0]='A';  //Dentro de los corchetes indicamos la posici�n a la que asignaremos un valor
		nombre[1]='l';
		nombre[2]='e';
		nombre[3]='x';
		nombre[4]='i';
		nombre[5]='s';
		
		System.out.println(nombre[4]); //Para darle salida en consola a una determinada posici�n indicamos el nombre del Array y la posici�n
		
		
		//Otra manera de declarar e iniciar un Array
		
		char[] nombre2 = {'A', 'l', 'e','x'}; //Aqu� ya tenemos un Array declarado con su longitud y los valores que tiene en cada posici�n.
		
		int[] numeros = {1,2,3,4,5}; //Aqu� tenemos un Array de caracteres num�ricos
		
		
//Un array con valores de tipo string
		String [] nombres = {"Aaron", "Sa�l", "Carolina","Uriel"};
//		
	boolean [] valor= {true,false,true,false};
//		System.out.println(valor[2]);
//		
//		
//		//Imprimir en pantalla todos los valores de un Array	
//	//Empleo un ciclo para iterar sobre cada posici�n e imprimir cada elemento 
//		for (int i=0;i<nombre2.length;i++) {   //i++ es incrementar la variable en 1 
//			System.out.println(nombre2[i]);
//			
//		}
		
		
		//Imprimir en el array los valores del array con un ciclo foreach
		for(int i:numeros) {
			System.out.print(i);
			
		}
	}

}

