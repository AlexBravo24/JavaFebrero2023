package com;

import java.util.Scanner;

public class Cient�fica extends Calculadora implements ICamara {

	
	
	public Cient�fica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cient�fica(String marca, double precio) {
		super(marca, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void restar(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void multiplicar() {
		int a;
		int b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer n�mero:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		b=entrada.nextInt ();
		entrada.close();
		System.out.println("Resultado de multiplicaci�n=" + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println ("Resultado de divisi�n: "+ (a/b));
		
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		System.out.println("Resultado multiplicaci�n: "+ (a*b*c));
		
		
	}

	@Override
	public void TomarFoto() {
		System.out.println("Tomando instant�nea...");
		
	}
	
	
    
	
	
	
	
}
