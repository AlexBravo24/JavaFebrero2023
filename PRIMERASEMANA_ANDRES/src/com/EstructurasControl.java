package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		
		// Estructuras de decisión IF - valores booleanos (verdadero o falso)
		
		int x=11; //mi variable x guarde un valor primitivo de tipo entero con un valor de 9

		if (x<10)  { //condicion dependiendo del valor de "x"
		System.out.println ("El valor es menor"); //si se cumple la condicion, se ejecuta la condicion
		}else { // Si no se cumple la condicion, que se ejecute lo siguiente
			System.out.println("El valor es mayor");
			
		}
	
	//Ejemplo con metodo de la clase string
	
	String nombre ="Murcielago";
	
	System.out.println(nombre.length());
	
	
	if (nombre.length()>=10) { //podemos utilizar operadores mayor que, menor que
		System.out.println("Si");
	}else {
		System.out.println("No");
	}	
	//Al devolvernos el metodo lenght un valor numerico, popdemos utilizarlo para operaciones
	System.out.println (nombre.length()+x);
	
	
	//Volver comentarios a varias lineas, seleccionamos lineas y presionamos teclas ctrl + 7
	
	
	//Condiciones compuestas con operadores lógicos AND, OR, NOT DIFERENTE DE, IGUALDAD
	
	   //AND - && - Nos devuelve un valor true cuando se cumplan todas las condiciones
	
	if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase ("murcielago")) {
		System.out.println ("si");
	}else {
		System.out.println ("no");
	
	}	
	
	//OR - || Nos devuelve un valor true cuando se cumple al menos una condicion
	
	if (nombre.length()>9 || nombre.equals ("murcielago")) {
		System.out.println ("Si");
		
	}else {
		System.out.println ("No");
	}
		
	//NOT - ! - Niega una condicion/cambia el valor de true a false y viceversa
	
	if(nombre.length()>9) {
		System.out.println("si");
	}else {
		System.out.println ("no");
	}
	
	//IGUALDAD O COMPARACION - (==) - Revisa o compara el valor. Si el valor es igual
	//y si no es igual manda false
	
	if (x==20) { //comparamos el valor de una variable con otro
		System.out.println ("si");
	}else {
		System.out.println ("no");
		
	}	
	//DIFERENTE DE - != - Compara el valor y si es diferente manda tru y si no manda false
	
	if (x !=11) {
		System.out.println ("si");
	}else {
		System.out.println ("no");
	}
	
	//Estructura if-else concatenado o if anidado
	
//	int d = 6; //inicio con una variable con valor
//	
//	if (d==1) { //inicio una condicion, comparando el valor contenido en d contra el que quiera compararlo
//		System.out.println ("Lunes");
//	}else if (d==2) {
//		System.out.println("Martes");
//	}else if (d==3) {
//		System.out.println ("miércoles");
//	}else if (d==4) {
//		System.out.println("jueves");
//}else if (d==5) {
//	System.out.println ("viernes");
//}else { //si no cumple con ninguna de las anteriores
//	System.out.println ("Desconocido");{
//		
	
	int dia = 6;
	
	switch (dia)  { // indicamos que vamos a decidir sobre el valor de la varible "dia"
	
	 case 1: //en caso de que dia valga 1
		 System.out.println("lunes");
	
		
	
	}//CIERRE DEL MAIN
	

	}//CIERRE DE LA CLASE
}