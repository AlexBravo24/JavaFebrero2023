package com;

public class EstructurasdeControl {

	public static void main(String[] args) {
		
		
		//Estructuras de decisi�n if- valores booleanos (verdaderos o Falsos)
		
	int x = 11; //en mi variable x guard� un valor primitivo de tipo entero (valor de 9)
//		
//		if (x<10) { //condici�n de la ejecuci�n de una acci�n dependiendo del valor de x
//			
//		System.out.println("El valor es menor"); //Si se cumple la condici�n se ejecuta el programa
//		
//		} else { // si no se cumple la condici�n entonces 
//			System.out.println("El valor es mayor");	
//		}
		
		
////       //Ejemplo con m�todo de la clase String
		String nombre = "Murcielago";
////		System.out.println(nombre.length()); //El m�todo lenght nos devuelve el valor de la
////		                                   //Longitud del string en valor num�rico
////		if (nombre.length()>=10) {
////			System.out.println("Si");
////		}else {
////			System.out.println("No");
//		}
		//Al devolvernos el metodo lenght un valor num�rico, podemos utilizarlo para operaciones
//ystem.out.println(nombre.length()+x);
		
	//Comentar en autom�tico una o varias lineas; seleccionamos las lineas
		// y presionamos las teclas Ctrl+7 
		
//Condiciones compuestas con operadores l�gicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
		//AND = && = Nos devuelve un valor true cuando se cumplan todas las condiciones
//		if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("murcielago")) {
//			System.out.println("Si");//Si se cumplen las 3 condiciones devuelve true
//		}else {//si no se cumple una, me devuelve false
//			System.out.println("No");
//		}
//		
//		
//	//OR - || - Nos devuelve un valor true cuando se cumple al menos una condici�n 
//		
//		if (nombre.length()>9 || nombre.equals("murcielago")) {
//			System.out.println("Si");}
//		else {
//			System.out.println("No"); 
//		}
			
		
//	//NOT ! Niega una condici�n/ Cambia el valor de True a False y viceversa
//		if (!(nombre.length()>9)) {
//			System.out.println("Si");	
//		} else {
//			System.out.println("No");
//		}
		
	//IGUALDAD O COMPARACI�N (==) Revisa o compara el valor, si el valor es igual manda True
		// y si no es igual manda false
		
//		if (x==20) { //Comparamos el valor que tiene guardado una variable contra otro
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda True, si no, manda False.
		
//		if (x != 11) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
////		
//		//ESTRUCTURA if else concatenado o if anidado
//		
//		int d = 2; // Inicio una variable entera con valor de 6
//		
//		if (d==1) { // Inicio una condici�n, comparando el valor contenido en d contra el que quiero comparar
//			System.out.println("Lunes"); // si no se cumple alguna condici�n pasa a la siguiente
//		} else if (d==2) {
//			System.out.println("Martes");
//		} else if(d==3) {
//			System.out.println("Mi�rcoles");
//		} else if (d==4) {
//			System.out.println("Jueves");
//		} else if (d==5) {
//			System.out.println("Viernes");
//		}else { // Si no cumple con ninguna de las anteriores
//			System.out.println("Desconocido"); 
//		}
//		
		
		//ESTRUCTURA DE DECISI�N SWITCH-CASE
		//Puede ser con tipo de dato int,String, char,etc.
		
		int d�a= 6;
		
		switch (d�a) {//Indicamos que vamos a decidir sobre el valor de la variable "d�a"
		
		case 1: //en caso de que d�a valga 1 
			System.out.println("Lunes");
			break; //Indica cierre del proceso 
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Mi�rcoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;
		case 5: 
			System.out.println("Viernes");
			break;	
		default: //En caso de que no se cumpla con ning�n valor
			System.out.println("Desconocido");
		}
		
		
	} // Cierre del main
	
} //Cierre de la clase
