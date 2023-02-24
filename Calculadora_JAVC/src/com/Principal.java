package com;

public class Principal {

	public static void main(String[] args) {
		
		Científica calculadora = new Científica ("Casio",750.23);
	
//		calculadora.sumar (3,3);
//		calculadora.restar(5,3);
//		calculadora.multiplicar (3,3);
//		calculadora.multiplicar(2,2,3);
		
		//Las clases toman comportamientos de 3 lugares:
		//1.De ella misma con metodos propios
		//2. de clases abstractas
		//3.De interfaces
		calculadora.TomarFoto();
	}

}
