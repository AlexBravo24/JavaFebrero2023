package com;

public class EstructurasdeControl {

	public static void main(String[] args) {
		
	//Estructuras de decision if - valores booleanos (verdaderos o falsos)
		
	int x = 11; //en mi variable x guardo un valor primitivo de tipo entero con un valor de 9
	
//	if (x<10) { //condicion de la ejecucion de una accion dependiendo del valor de "X"
//		System.out.println("El valor es menor");
//	}else { //si no se cumple la condicion que ejecute lo siguiente
//		System.out.println("El valor es mayor");
//	}
	
	//Ejemplo con un metodo de la clase string
	
//	String nombre = "Murcielago";
//	
//	System.out.println(nombre.length()); // el metodo length devuelve el valor de
										// la logitud en valor numerico
	
//	if (nombre.length()>=10) { //podemos usar operadores mayor, menor o igual que
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
//	
//	//Al devolvernos el metodo length un valor numerico, podemos usarlo para operaciones
//	System.out.println(nombre.length() + x);

	//comentar una o mas lineas selecionamos la linea y ponemos ctl + 7
	
	//condiciones compuestas con operadores logicos AND, OR, NOT, Diferente De, Igualdad
	
	//AND - && - nos devuelve un valor true cuando se cumplan todas las condiciones
	
//	if (nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("murcielago")) {
//		System.out.println("si");
//	}else {
//		System.out.println("No");
//	}
	
	//OR - || - nos devuelve true cuando cumpla al menos una condicion
	
//	if (nombre.length()>9 || nombre.equals("murcielago")) {
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//NOT ! Niega una condicion/cambia el valor de True a false y viceversa
	
//	if (!(nombre.length()>9)) {
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//Igualdad o Comparacion (==) - Revisa o compara el valor. si el valor es igual
	//y si no es igual manda falso
	
//	if (x==20) { //comparamos el valor que tiene guardado una variable con otro
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//Diferente De - !- - Compara el valor si es diferente manda true si no manda false
	
//	if (x != 11) { 
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//Estructura if else concatenado o if anidado
	
//	int d = 7; //iniciamos una variable entera con valor de 6
//	
//	if(d==1) { // inicio una condicion comparando el valor contenido en d contra el que quiera
//		System.out.println("Lunes");
//	}else if(d==2) {
//		System.out.println("Martes");
//	}else if(d==3) {
//		System.out.println("Miercoles");
//	}else if(d==4) {
//		System.out.println("Jueves");
//	}else if(d==5) {
//		System.out.println("Viernes");
//	}else {
//		System.out.println("Desconocido");
//	}
	
	//Estructura de descision Switch-Case
	//Puede ser con tipos de datos int, string, char etc
	
//	int dia = 5;
//	
//	switch (dia) { //indicamos que vamos a decidir el valor de la variable dia
//	case 1: //en caso de que dia valga 1
//		System.out.println("Lunes");
//		break; //indicamos un cierre del proceso
//	case 2:
//		System.out.println("Martes");
//		break;
//	case 3:
//		System.out.println("Miercoles");
//		break;
//	case 4:
//		System.out.println("Jueves");
//		break;
//	case 5:
//		System.out.println("Viernes");
//		break;
//		default: //En caso de que no se cumpla ningun valor
//			System.out.println("Desconocido");
//			break;
//	}
	
}//cierre del main
	
}//cierre de la clase
