package com;

public class Array {

	public static void main(String[] args) {
		/*Los arrays son una estrustura de datos que almacena un tipo de datos en com�n
		 * y una vez declarado su tama�o o loongitud este no puede crecer o cambiar
		 */
		
		char nombre[] = new char[4];//se declara un array de caracteres de tama�o 4
		
		//Asignando datos o valores a cada posicion del arreglo
		nombre[0] = 'A';//dentro de los [ ] indicamos la posicion a la cual asiganaremos el valor
		nombre[1] = 'l';
		nombre[2] = 'm';
		nombre[3] = 'a';
	
		System.out.println(nombre[3]);//para darle salida a un dato del arreglo, nombre[posicion]
		
		//otra forma de declarar un array
		char nombre2[] = {'I', 't', 'z', 'e', 'l'};//aqui tenemos un array con sus valores en cada posicion
		int numero[] = {1, 2, 3, 4};//array con valores numericos
		String nombres[] = {"Alma", "Itzel", "Ana"};//array con valores de tipo String
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
