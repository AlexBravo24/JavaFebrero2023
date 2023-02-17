package com;

public class Array {

	public static void main(String[] args) {
		// Son una estructura de datos en común que almacenan 
    // y una vez declarado su tamaño o longitud este no puede
		//crecer o cambiar 
		
		
		
		char[] nombre = new char[6]; //Un array de caracteres con su tamaño declarado
		//en los corchetes declaro la longitud o tamaño del Array
		
		//Asignando datos o valores a cada posición del array
		
		nombre[0]='A';  //Dentro de los corchetes indicamos la posición a la que asignaremos un valor
		nombre[1]='l';
		nombre[2]='e';
		nombre[3]='x';
		nombre[4]='i';
		nombre[5]='s';
		
		System.out.println(nombre[4]); //Para darle salida en consola a una determinada posición indicamos el nombre del Array y la posición
		
		
		//Otra manera de declarar e iniciar un Array
		
		char[] nombre2 = {'A', 'l', 'e','x'}; //Aquí ya tenemos un Array declarado con su longitud y los valores que tiene en cada posición.
		
		int[] numeros = {1,2,3,4,5}; //Aquí tenemos un Array de caracteres numéricos
		
		
//Un array con valores de tipo string
		String [] nombres = {"Aaron", "Saúl", "Carolina","Uriel"};
//		
	boolean [] valor= {true,false,true,false};
//		System.out.println(valor[2]);
//		
//		
//		//Imprimir en pantalla todos los valores de un Array	
//	//Empleo un ciclo para iterar sobre cada posición e imprimir cada elemento 
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

