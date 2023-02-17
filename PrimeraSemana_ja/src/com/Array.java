package com;

public class Array {

	public static void main(String[] args) {
		/*Los arrays son una estructura de datos
		 * almacenan un tipo de dato en comun
		 * y una vez declarado su tamañp o longitud
		 * este no puede crecer o cambiar
		 * 
		 */

		
		
		char [] nombre = new char [6] ;

		
		
			nombre [0] = 'A';
			nombre [1] = 'l';
			nombre [2] = 'e';
			nombre [3] = 'x';
			nombre [4] = 'i';
			nombre [5] = 's';
			
//			System.out.println(nombre[4]); // para darle salida en cosola
//			
//			
//			//otra manera de declarar e iniciar un array
//			
//			char [] nombre2 = {'A','l','e','x'}; //Aqui ya tenemos un array declardo con su longitud
//												// y valores que tienen en cada posicion
			int [] numeros = {1,2,3,4,5}; //Aqui tenemos un array con valores numericos enteros
//			
//			String [] nombres = {"Aaron", "Sthephany", "Eduardo", "Gerardo", "Itzel"};
//			
//		System.out.println(numeros[2]);
//		
//			boolean [] valor = {true,false,true,false};
//			
//			//imprimir en pantalla todos los valores de un array
//			//empleo un ciclo para iterar sobre cada posicion e imprime cada elemento
//			
//			for (int i=0; i<nombre2.length; i++) {
//				System.out.print(nombre2[i]);
//			}
			
			for (int i:numeros) { //para cada elemento de array
				System.out.println(i);//imprime cada uno de ellos
			}
			
			//
			
			
		
		
	}

}
