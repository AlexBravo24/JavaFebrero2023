package com;

import java.util.Scanner;

public class Científica extends Calculadora implements ICamara {

	
	
	public Científica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Científica(String marca, double precio) {
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
		System.out.println("Introduce el primer número:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		b=entrada.nextInt ();
		entrada.close();
		System.out.println("Resultado de multiplicación=" + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println ("Resultado de división: "+ (a/b));
		
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		System.out.println("Resultado multiplicación: "+ (a*b*c));
		
		
	}

	@Override
	public void TomarFoto() {
		System.out.println("Tomando instantánea...");
		
	}
	
	
    
	
	
	
	
}
