package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciado un objeto
		Cientifica calculadora = new Cientifica ("Casio", "LX-2000", "negro");
		System.out.println(calculadora);
		
		//Mtodos heredados de calculadora
		//Pide los resultados desde la clase cientifica
		calculadora.sumar(30,6);
		calculadora.resta(10, 8);
		calculadora.multiplicar(4, 9);
		calculadora.dividir(20, 5);
//		//como se le van agrgar los valores por teclado no se le agregan argumentos aqui
		calculadora.suma();
//		//Metodo con un mismo nombre pero con diferente comportamiento
//		//Sobrecarga de argumentos
		calculadora.suma(7, 10, 3);
		
		//Las clases toman comportamientos de 3 lugares:
		//1. de ella misma con metodos propios
		//2. de clases abstractas
		//3. de interfaces
		
		//Metodo de la interface camara
		calculadora.tomarFotos();
	}

}
