package com;
// 

import java.util.Scanner;

public class Cientifica extends Calculadora implements ICamara {
	

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("resultado suma ="+ (a+b));
		
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("resultado suma ="+ (a-b));
	
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("resultado de la operacion ="+ (a*b));
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("resultado de la operacion ="+ (a/b));
		
	}

	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		int a ;
		int b;
		Scanner entrada =new Scanner(System.in);
		System.out.println("introduce el primer valor");
		a=entrada.nextInt();
		System.out.println("introduce el primer valor");
		b=entrada.nextInt();
		entrada.close();
		
		System.out.println("resultado de la operacion"+ (a*b));
		
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("resultado de la operacion"+ (a*b*c));
		
	}

	@Override
	public void tomarFoto() {
		// TODO Auto-generated method stub
		System.out.println("resultado de tomar foto");
		
	}
	
	

}
