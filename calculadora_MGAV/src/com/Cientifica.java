package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ICamara  {
	
	public Cientifica() {
	
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suma(int a, int b) {
		System.out.println("Resultado suma:" + (a+b));
		
	}

	@Override
	public void resta(int a, int b) {
		System.out.println("Resultado resta:" + (a-b));
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("Resultado multiplicacion:" + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("Resultado divicion:" + (a/b));
		
	}

	@Override
	public void multiplicar() {
		int a;
		int b;
		Scanner entrada= new Scanner (System.in);
		System.out.println("introduce el primer numero");
		a= entrada.nextInt();
		System.out.println("introduce el segundo numero");
		b= entrada.nextInt();
		entrada.close();
		
		
		System.out.println("Resultado multiplicacion:" + (a*b));
	}

	@Override
	public void tomarfoto() {
		System.out.println("Tomando una fotografia....");
		
	}


		
	
	
	

}
