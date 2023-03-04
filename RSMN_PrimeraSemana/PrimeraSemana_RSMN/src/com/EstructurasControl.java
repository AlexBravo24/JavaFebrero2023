package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// estructuras de deision if - valores booleanos 
		
	int x = 11;
//		
//		if (x<10) {// condicion de la ejecucion de una accion dependiendo del valor x
//			System.out.println("el valor es menor");// si se cumple la condicion se ejecuta
//
//	}else {// si no se cumple la condicion que se ejecute lo siguiente
//		System.out.println("el valor es mayor");
//	}
//
//		
//		// ejemplo con un metodo de la clase string
//		
		String nombre = "murcielago";
//		System.out.println(nombre.length());// el metodo length nos devuelve el valor
//		// de la longitud del string en valor numerico
//		
//		if(nombre.length()>=10) {// podemos utilizar operadores mayor que, menor o igual y mayor o igual
//			System.out.println("si");
//	
//		}else {
//			System.out.println("no");
//		}
		
		// al devolvernos el metodo length un valor numerico podemos utilizarlo para operaciones
		System.out.println(nombre.length()+ x);
		
		// condiciones compuestas con operdores logicos ADN OR NOT
		
		//and && nos devuelve un valor true cuando se compilan todas las condiciones
		
		if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("murcielago")) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
		
		// operador OR || nos devuelve true cuando se cumple una condicion
		
//		if (nombre.length()>9 || nombre.equals("murcielago")) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		//not ! niega una condicion/cambia el valor de true a false
		
//		if(nombre.length()>9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
	//igualdad o comparacion (==) revisa o compara el valor si el valor es igual
		
//		if (x ==20) {// comparamos el valor que tiene guardado una variable contra otro
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
	// diferente de != compara el valor y si es diferente manda true si no manda false

//		if (x != 11) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
	// estructura if-else o is anidado	
		
		int d=6;//inicio una variable entera con valor de 6
		if(d==1) {
			System.out.println("lunes");
		} else if (d==2) {
			System.out.println("martes");
		}else if(d==3) {
			System.out.println("miercoles");
		}else if(d==4) {
			System.out.println("jueves");
		}else if(d==5) {
			System.out.println("viernes");
		}else {
			System.out.println("desconocido");
		}
		
		
		
	// switch-case
		
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
		 }
				
		
}// cierre de llave main 
	

}