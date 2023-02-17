package com;

public class EstructurasControl {

	public static void main(String[] args) {

		
		//Estructura if (valores booleanos(Verdadero/ Falso))
		int x = 15; //variable x, dato primitivo con un valor de 9
//		if(x < 10) { //condicion de ejecion de una accion dependiendo del valor de x
//			System.out.println("El Valor es MENOR");//si se cumple la condicion se ejecuta la accion
//		}else {//si no se cumple la condicion, que se ejecute lo siguiente
//			System.out.println("El Valor es MAYOR");
//		}
		
		//Ejemplo con un Metodo String
		String nombre = "Murcielago";
//		System.out.println(nombre.length());//metodo length, devuelve el valor de la longitud del String en valor numerico
//		
//		if(nombre.length() >= 10) {
//			System.out.println("Sí");
//		}else {
//			System.out.println("No");
//		}
		
		//al devolvernos el metodo length un valor numerico se puede utilizar para operaciones
//		System.out.println(nombre.length()+x);
		
		
		//Condiciones compuestas con operadores logicos AND, OR, NOT, DIFERENTE DE, IGUAL
		//AND &&  nos devuelve un valor True cuando se cumplen las condiciones 
//		if(nombre.length() < 20 && nombre.length() > 9 && nombre.equalsIgnoreCase("murcielago")) {//metodo .qualsIgnoreCase ignora mayusculas y minusculas
//			System.out.println("Sí");//se tienen que cumplir las 3 condiciones para que realice esta instruccion
//		}else {//false si no se cumple una condicion
//			System.out.println("No");
//		}
//		
//		//OR || Nos devuelve un valor True cuando se cumple al menos una condicion
//		if(nombre.length() > 9 || nombre.equals("murcielago")) {
//			System.out.println("Sí");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT ! Niega una condicion/ Cambia el valor de True a False y viceversa
//		if(!(nombre.length() > 9)) {// se niega la condicion
//			System.out.println("Sí");
//		}else {
//			System.out.println("No");
//		}
		
		
		//IGUALDAD O COMPARACION == Compara el valor Si el valor es igual manda True sino False
//		if(x == 15) {//Comparamos el valor de la variable x con 15
//			System.out.println("Sí");
//		}else {
//			System.out.println("No");
//		}
		
		
		//DIFERENTE DE != Compara el valor y si es diferente manda True si no manda False
//		if(x != 15) {
//			System.out.println("Sí");
//		}else {
//			System.out.println("No");
//		}

		
		//ESTRUCTURA IF ELSE Concatenado o if anidado
//		int d = 2;//Inicializo una variable entera con valor de 6
//		if(d == 1) {//Inicio una condicion del valor contenido en d contra el valor 1
//			System.out.println("Lunes");//Si se cumple imprime Lunes
//		}else if(d == 2) {
//			System.out.println("Martes");
//		}else if(d == 3) {               
//			System.out.println("Miercoles");
//		}else if(d == 4) {                    //ifs anidados
//			System.out.println("Jueves");
//		}else if(d == 5) {
//			System.out.println("Viernes");
//		}else {                               //si no cumple ninguna de las anteriores
//			System.out.println("Fin de semana");
//		}
		
		//Estructura de decision Switch-Case, puede evaluar int, String, Char, etc
		int dia = 6;
		switch(dia) {
		
		case 1: //en caso de que dia = 1
			System.out.println("Lunes");
			break;
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
		default://en caso de que no se cumpla ningun valor
			System.out.println("Fin de semana");
		}
		
	}//cierre main

}//cierre clase
