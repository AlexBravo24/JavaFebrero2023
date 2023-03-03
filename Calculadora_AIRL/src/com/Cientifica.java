package com;

import java.util.Scanner;

//heredamos de Calculadora, y agregamos metodos implementados en la advertencia
public class Cientifica extends Calculadora implements ICamara{

	@Override
	public void sumar(int a, int b) {
		System.out.println("El resultado de "+a+" + "+b+" es: "+(a+b));
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("El resultado de "+a+" - "+b+" es: "+(a-b));		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de "+a+" * "+b+" es: "+(a*b));	
		
	}
	
	@Override
	public void multiplicar() {
		int a, b;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digita el primer numero:");
		a = entrada.nextInt();
		System.out.print("Digita el segundo numero:");
		b = entrada.nextInt();
		entrada.close();
		System.out.println("El resultado de "+a+" * "+b+" es: "+(a*b));
	}

	@Override
	public void division(int a, int b) {
		System.out.println("El resultado de "+a+" * "+b+" es: "+(a/b));		
	}

	

	@Override
	public void multiplicar(int a, int b, int c) {
		System.out.println("El resultado de "+a+" * "+b+" * "+c+ " es: "+(a*b*c));	
		
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
	public void tomarFoto() {
		System.out.println("Tomando una foto");
		
	}
	
	//Se pueden inmplementar metodos propios
	public void cuadrado(int a) {
		System.out.println("El resultado es: "+(a*a));	
		
	}
	

}
