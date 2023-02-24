package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calculadora = new Cientifica("Casio", "f01", "Azul");
		System.out.println(calculadora);
//		calculadora.sumar(3, 3);
//		calculadora.restar(5, 2);
//		calculadora.multiplicar(5, 8, 3);
		
		//Las clases toman comportamientos de 3 lugares
		//1. de ella misma con metodos propios
		//2. de clases abstractas
		//3. de interfaces
		
		//Ejemplo de metodo de la interface ICamara
		calculadora.tomarFoto();
		
		//Metodo de la clase cientifica
		calculadora.cuadrado(3);
		

	}

}
