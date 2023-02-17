package com;

public class EstructuraControl {

	public static void main(String[] args) {
		
		
		//estructura de decision IF - valores booleanos (verdaderos o falso)
		
		int x = 11; // mi variable de x guarda un valor primitivo de tipo entero con un valor de 9

//		if(x<10) { // condicion de ejecucion del valor de "x"
//		System.out.println("EL valor es menos"); //Si se cumple la condicion se cumple la accion
//		}else { // sino se cumple la condicion, se ejecute lo siguiente
//			System.out.println("El valor es mayor");
//		}
		
		//Ejenplo de  un metodo de la clase String
	
		String nombre = "Murcielago";
		
//		System.out.println(nombre.length()); //El metodo lenght nos devuelve el valor de la 
											//longitud del String en valor numerico
		
//		if (nombre.length()>=10){	//Podemos utilizar operadores mayor que, menor que, menor o igual / mayor o igual
//			System.out.println("Si");
//		}else {
//			System.out.println("no");
//		}
		
		//Al devolvernos el metodo length un valor numerico, podemos utilzarlo para operaciones
//		System.out.println(nombre.length()+x);
		
		//Comentar por automatico una o varias lineas. Selecionamos las lineas
		//y presionamos las teclas Ctrl + 7
		
//Condiciones compuestas con operaciones logicis AND, OR NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Nos devuelve un valor true cuando se cumplan todas las condiciones
		
//		if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("murcielago")){
//			System.out.println("Si");//SI SE CUMPLEN LAS 3 CONDICIONES NE DEVUELVE TRUE
//		}else {//SI NO SE CUMPLE UNA, ME DEVUELVE FALSE
//			System.out.println("No");
//		}
		
		//OR - || - NOS DEVULEVE UN VALOR TRUE CUANDO SE CUMPLE AL MENOS 1 CONDICIONES
//		
//		if(nombre.length()>9 || nombre.equals("murcielago")){
//			System.out.println("Si");//SI SE CUMPLEN  1 CONDICION ME DEVUELVE TRUE
//		}else {//SI NO SE CUMPLE NINGUNA, ME DEVUELVE FALSE
//			System.out.println("No");
//		}
		
		//NOT - ! - NIEGA UNA CONDICION/CAMBIA EL VALOR DE TRUE A FALSE Y VICEVERSA
		
//		if(!(nombre.length()>9)){
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//			
		//IGUALDAD O COMPARACION - (==) - REVISA O COMPARA EL VALOR. SI EL VALR ES IGUAL MANDA TRUE
		// Y SI NO ES IGUAL, MANDA FALSE
		
//		if(x==20) { //Comparamos el valor que tiene guardado una variable contra otro
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE  - != - Compara el valor y si es diferente manda true,si no, manda false
			
//		if(x != 10) { 
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//estructura if*else o if anidado
		
		int d = 2; //Inicio una variable entera con un valor de 6
//		
//		if(d==1) { //Inicio una condicion, comparando el valor contenido en d contra el valor que quiero comparar		
//			System.out.println("Lunes"); //SI NO SE CUMPLE ALGUNA CONDICION, PASA ALA SIGUIENTE
//		}else if (d==2){
//			System.out.println("Martes");
//		}else if (d==3){
//			System.out.println("Miercoles");
//		}else if (d==4){
//			System.out.println("Viernes");
//		}else{ // SI NO SE CUMPLE CON ALGUNA DE LAS ANTERIORES
//			System.out.println("Desconocido");	
//		}
//		
		//ESTRUCTURA DE DECISION SWITCH-CASO
		//ESTA PUEDE SER CON TIPO DE DATO INT, STRING, CHAR, ETC
		
		
		
		int dia = 6;
		
		switch (dia) {//Indicamos que vamos a cambiar o decidir sibre el valor de la variable "dia"
		
		case 1: //en caso de que el dia valga 1
			System.out.println("Lunes");
			break; //indica un cierre de proceso
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
		default: //En caso de que no se cumpla ningun valor 
			System.out.println("Desconocido");
			break;
		
		
			
			
			
		}
		
		}// CIERRE DE MAIN

}// CIERRE DE LA CLASE
