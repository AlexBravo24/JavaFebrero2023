package com;

public class Array {

	public static void main(String[] args) {
		//*Los arrays son una estrustura de datos que almacena un tipo de datos en común
		// * y una vez declarado su tamaño o loongitud este no puede crecer o cambiar
		 //*/
		
		char nombre[] = new char[5];//se declara un array de caracteres de tamaño 4
		
		//Asignando datos o valores a cada posicion del arreglo
		nombre[0] = 'M';//dentro de los [ ] indicamos la posicion a la cual asiganaremos el valor
		nombre[1] = 'a';
		nombre[2] = 'r';
		nombre[3] = 'i';
		nombre[4] = 'o';
	
		System.out.println(nombre[3]);//para darle salida a un dato del arreglo, nombre[posicion]
		
		//otra forma de declarar un array
		char nombre2[] = {'M', 'a', 'r', 'i', 'o'};//aqui tenemos un array con sus valores en cada posicion
		int numero[] = {1, 2, 3, 4};//array con valores numericos
		String nombres[] = {"Mario", "Aragon", "German"};//array con valores de tipo String
		boolean valor[] = {true, false, false, false};
		
		System.out.println(nombres[2]);
		
		//Imprimir todos los valores del arreglo, con un ciclo para iteraciones
//		for(int i=0; i<nombre2.length; i++) {
//			System.out.print(nombre2[i]);		
//		}
//		System.out.println("\n");
//		//imprimir con un for each
//		for(char i:nombre2) {
//			System.out.println(i);
//		}
		
		//
		for(int i:numero) {
			System.out.println(i);
		}
		
	

	}

}

