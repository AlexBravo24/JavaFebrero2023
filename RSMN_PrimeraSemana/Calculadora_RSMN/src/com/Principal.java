package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cientifica calculadora =new Cientifica("casio","fx-200","negro");
		//ejemplos de metodos heredados de calculadora
//				calculadora.sumar(4, 4);
//				calculadora.sumar(4, 6);
		calculadora.multiplicar(3,4);
//				calculadora.multiplicar();
				calculadora.multiplicar(5, 6, 2);
				
				
				// las clases toman comportamientos de 3 lugares
				// una.- de ella misma con metodos propios
				// segunda.- de clases abstractas
				// tercera .-de interfaces
				
				// ejemplo de la clase de interface Icamara
				calculadora.tomarFoto();
				
	}

}
