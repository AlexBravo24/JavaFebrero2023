package com;

public class Principal {
	public static void main(String[] args) {
		Cientifica calculadora = new Cientifica("CASIO", "TX-350", "Azul");
		
		System.out.println(calculadora);
//		calculadora.suma(5, 6);
//		calculadora.resta(10, 3);
//		calculadora.multiplicacion(4, 5);
//		calculadora.division(21, 7);
//		calculadora.multiplicacion();
		calculadora.multiplicacion(3, 3, 3);
		
		//Las clases toman comportamientos de 3 lugares, 
		//1.- de ella misma - metodos propios
		//2.- de clases abstractas o padres
		//2.- de interfaces
		calculadora.tomarFoto();
	}
}
