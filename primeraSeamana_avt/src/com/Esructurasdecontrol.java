package com;

public class Esructurasdecontrol {

	public static void main(String[] args) {
		//estructuras de decision if= valores boleanos (verdaderos o falsos
		int x=9;
		/*if (x<10) { //condicion de la ejecucion del valor
			System.out.println("el valor es menor");//si se cumple la condicion se ejecuta el programa
			
		}else { //sino se cumple la condicion, que se ejecute lo siguiente
			
			System.out.println("el valor es mayor");
			
		}
		// ejemplo con un metodo de la clase String
		String nombre ="Murcialogo";
		System.out.println(nombre.length()); //el metodo length nos devuelve el valor dela longitud
		if (nombre.length()>=10) { //podemos utilizar operadores mayor, menore igual
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		//Al devolvernos un metodo length un valor nuemrico, podemos utilizarlo
		System.out.println(nombre.length()+x);
		
		//condiciones compuestas con operadores logicos AND,OR NOT,DIFERENTE DE, IGUALDAD
		//AND && nos devuelve un valor true cuando se cumplan todas las condiciones
		if (nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("murcilago")){
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		//OR || nos devuelve un valor true cuando se cumple al menos una condicion
		if (nombre.length()>9 || nombre.contentEquals("murcielago")) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		//NOT ! niega una condicion/ cambia el valor de true a false y vicivera
		if (!(nombre.length()>9)) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
			
		}
		
		//DIFERENTE DE != compara el valor y si es diferente manda true y si no manda false
		if(x !=11) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}*/
		//Estructura if-else aninado
		int d =5;
		if (d==1)	{
			System.out.println("lunes");
		}else if(d==2) {
			System.out.println("martes");
			
		}else if (d==3) {
			System.out.println("miercoles");
		}else if(d==4) {
			System.out.println("jueves");
		}else if (d==5) {
			System.out.println("viernes");
		}else {
			System.out.println("desconocido");
		}
		//estructura Switch case
		//puede ser con tipo de dato int string etc
		int dia =2;
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		
	    case 2:
		System.out.println("martes");
		break;
		
	    case 3:
			System.out.println("miercoles");
			break;
			
	    case 4:
			System.out.println("jueves");
			break;
			
	    case 5:
			System.out.println("viernes");
			break;
	    default:
				System.out.println("desconocido");
				break;
	}

}
}