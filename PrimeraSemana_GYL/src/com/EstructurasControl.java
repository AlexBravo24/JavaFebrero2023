package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Estructuras de decision if= valores booleanos (verdadesros o falsos)
		
	int x=11; //en mi variable x guarde un valor primitivo de tipo entero con un valor de 9
	
//	if (x<10) {//condicion de la ejecucuion de una accion dependiendo del valor de "x"
//	System.out.println("El valor es menor");
//	}else { //Si no se cumple la condicion, que se ejecute lo siguiente
//		System.out.println("El valor es mayor");
//	}
	
	//Ejemplo con un METODO de la clase String 
	
	String nombre = "Murcielago";
	
//	System.out.println(nombre.length()); //El metodo length nos devuelve el valor de la 
//										//longitud del String en valor numerico
//	el metodo .length reconoce un espacio como un caracter
//	if (nombre.length()>=10) {//Podemos utilizar operadores mayor que, menor que, menor o igual / mayor o igual
//		System.out.println("si");
//	}else {
//		System.out.println("No");//si es mayor que 10 es no
//	}
	
	//Al devolvernos el metodo length un valor numerico, podemos utilizarlo para operaciones
//	System.out.println(nombre.length() + x);
	
	//Comentar en automatico una o varias lineas, seleccionamos las lineas
	//y presionamos las teclas Ctrl + 7
	
//Condiciones compuestas con operadores logicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
	
	//AND - && - Nos devuelve un valor true cuando se cumplan todas las condiciones 
//	if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("murcielago")) {
//		System.out.println("Si");// Si se cumplen las 3 condiciones me devuelve true 
//	}else {//Si no se cumple una, me devuelve false
//		System.out.println("No");
//	}//Cierre del if
//	
//	//OR - || - Nos devuelve un valor true cuando se cumple al menos una condicion
//	if (nombre.length()>9 || nombre.equalsIgnoreCase("murcielago")) {
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//Not - ! - Nuiega una condicion/Cambia el valor de True a False y viceversa
//	if (!(nombre.length()>9)) {//No queremos que sea mayor a 9
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//IGUALDAD O COMPARACION - (==) - Revisa o compara el valor. Si el valor es igual manda true
	// y si no es igual, manda false
	
//	if (x==20) {//Comparamos el valor que tiene una variable contra otro 
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
//	
//	//DIFERENTE DE - != - Compara el valor y si es diferente manda True, si no, manda False
//	if (x != 10) {
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
	
	//ESTRUCTURA if-else concatenado o if anidado
//	int d = 5;
//	
//	if (d==1) {//Inicio una condicion, comparando el valor contenido con d contra el valor que quiera comparar
//		System.out.println("Lunes");//Si no se cumple alguna condicion pasa a la sieguiente.
//	}else if (d==2) {
//		System.out.println("Martes");
//	}else if (d==3) {
//		System.out.println("Miercoles");
//	}else if (d==4) {
//		System.out.println("Jueves");
//	}else if (d==5) {
//		System.out.println("Viernes");
//	}else {//Si no cumple con nunguna de las anteriores, ejecuta la siguiente
//		System.out.println("Desconocido");
//	}
	
	//ESTRUCTURA DE DESICION switch-case
	//Puede ser con tipo de dato int, string, char, etc.
	int dia = 2;
	
	switch (dia) {//Indicamos que vamos a decidir sobre el valor de la variable dia
	case 1: //en caso de que dia valga
		System.out.println("Lunes");
		break; //indicamos un cierre del proceso
	case 2:
		System.out.println("Martes");
		break;
	case 3:
		System.out.println("Miercoles");
		break;
	case 4:
		System.out.println("Jueves");
		break;
	case 5:
		System.out.println("Viernes");
		break;
	default://en caso de que no se cumpla con ningun valor
		System.out.println("Desconocido");
	}
	
	}//Cierre del main
}//Cierre de la clase
