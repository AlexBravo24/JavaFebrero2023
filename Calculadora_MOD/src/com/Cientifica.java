package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ICamara {
	
	public Cientifica() {
		super();
	}
	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	@Override
	public void suma(int a, int b) {
		System.out.println("Resultado suma: " + (a + b) );
	}
	@Override
	public void resta(int a, int b) {
		System.out.println("Resultado resta: " + (a - b) );
		
	}
	@Override
	public void multiplicacion(int a, int b) {
		System.out.println("Resultado multiplicacion: " + (a * b) );
	}
	@Override
	public void division(int a, int b) {
		System.out.println("Resultado division: " + (a / b) );
	}
	@Override
	public void multiplicacion() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el primer numero: ");
		int a = entrada.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		int b = entrada.nextInt();
		entrada.close();
		System.out.println("Resultado multiplicacion: " + (a * b) );
	}
	@Override
	public void multiplicacion(int a, int b, int c) {
		System.out.println("Resultado multiplicacion: " + (a * b * c) );
		
	}
	@Override
	public void tomarFoto() {
		System.out.println("Tomando foto...");
		
	}	
}
