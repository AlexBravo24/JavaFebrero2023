package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//estructuras de decision: IF - valores booleanos (verdaderos o falsos)
		
		int x= 9;
		
//		if(x<10) {
//			System.out.println("el valor es menor");
//		}
//		else {
//			System.out.println("el valor es mayor");
//		}
		
		//Ejemplo con un metodo de la clase String
		
		String nombre = "murcielago";
		System.out.println(nombre.length());
		
		if(nombre.length()<=10) {
			System.out.println("el nombre esta permitido");
		}
		else {
			System.out.println("el nombre excede el numero de caracteres");
		}
		
		//al devolvernos el metodo length un valor numerico podemos utilizarlo para operaciones
		
		System.out.println(nombre.length() + x);
		
		//condiciones compuestas con operadores logicos
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD
		// AND - && - DEVUELVE TRUE CUANDO SE CUMPLAN TODAS LAS CONDICIONES
		// OR - || - DEVUELVE TRUE CUANDO SE CUMPLE AL MENOS UNA CONDICION
		// NOT - ! - NIEGA UNA CONDICION, CAMBIA EL VALOR DE TRUE A FALSE Y VICEVERSA 
		// IGUAL - == - DEVUELVE TRUE SI AMBOS ELEMENTOS SON IGUALES
		// DIFERENTE - != - DEVUELVE TRUE SI LOS ELEMENTOS SON DISTINTOS
		
		//AND
//		if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("Murcielago")) {
//			System.out.println("si cumple");
//			
//		}
//		else {
//			System.out.println("no cumple");
//		}
		
		//OR
//		if(nombre.length()>9 || nombre.equals("Murcielago")) {
//			System.out.println("si se cumple OR");
//			
//		}
//		else {
//			System.out.println("no se cumple OR");
//		}
		
		//NOT
//		if(!(nombre.length()>9)) {
//			System.out.println("si");
//		}
//		else {
//			System.out.println("no");
//		}
		
		//IGUALDAD O COMPARACION
//		if(x == 20) {
//			System.out.println("si es igual");
//		}
//		else {
//			System.out.println("no es igual");
//		}
		
		//DIFERENTE DE
//		if(x != 20) {
//			System.out.println("NO es igual");
//		}
//		else {
//			System.out.println("SI es igual");
//		}
		
		
		//Estructura if - else concatenado o if anidado
		
//		int d = 6;
//		
//		if(d==1) {
//			System.out.println("lUNES");
//		}
//		else if(d==2) {
//			System.out.println("martes");
//		}
//		else if(d==3) {
//			System.out.println("miercoles");
//		}
//		else if(d==4) {
//			System.out.println("jueves");
//		}
//		else if(d==5) {
//			System.out.println("viernes");
//		}
//		else {
//			System.out.println("fin de semana");
//		}
		
		
		// Estructura de decision Switch-Case
		//Puede ser con un tipo de dato int, String, char, etc
		
		int dia = 6;
		
		switch (dia) {
		
		case 1: System.out.println("lunes");
				break;
		case 2: System.out.println("martes");
				break;
		
		case 3: System.out.println("miercoles");
				break;
		
		case 4: System.out.println("jueves");
				break;
		
		case 5: System.out.println("viernes");
				break;
		
		default: System.out.println("fin de semana");
				break;
		
		
		
		}
	}

}
