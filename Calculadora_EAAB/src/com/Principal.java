package com;

import java.util.Scanner;

public class Principal {

	static double n1,n2;
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		pedirDatos();
		verResultados();
		
		
		

	}
	
	public static  void pedirDatos() {
		System.out.print("ingrese el 1er numero");
		n1 = entrada.nextDouble();
		System.out.print("ingrese el 2do numero");
		n2 = entrada.nextDouble();
	}
	
	public static void verResultados() {
		Cientifica calcu = new Cientifica("casio","a800","roja");
		
		System.out.println("SUMA: "+calcu.suma(n1,n2));
		System.out.println("RESTA: "+calcu.resta(n1,n2));
		System.out.println("MULTIPLICACION: "+calcu.producto(n1,n2));
		System.out.println("DIVISION: "+calcu.division(n1,n2));
		
		
		//las clase toman comportamientos de 3 lugares:
		//1. de ella misma con metodos propios
		//2.- de clases abstractas
		//3.- de interfaces
		calcu.tomarFoto();
	}

}
