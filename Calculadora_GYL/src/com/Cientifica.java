package com;
import java.util.Scanner;
//Ahora heredamos de calculadora con la palabra extends despues
//del nombre de la clsa y con el nombre de la clase de la que heredaremos

public class Cientifica extends Calculadora implements ICamara{

	
	
	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Metodo propio
	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println("Resultado suma= "+ (a+b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resta(int a, int b) {
		System.out.println("Resultado resta= "+ (a-b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("Resultado multiplicar= "+ (a*b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("Resultado division= "+ (a/b));
		// TODO Auto-generated method stub
		
	}

	@Override
	//Otro metodo para calcular por teclado
	public void suma() {
		int a;
		int b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero: ");
		a = entrada.nextInt();
		Scanner entrad =new Scanner (System.in);
		System.out.println("Introduce el segundo numero: ");
		b = entrad.nextInt();
		entrada.close();
		
		System.out.println("Resultado: "+(a+b));
		// TODO Auto-generated method stub	
	}
	@Override
	public void suma(int a, int c, int b) {
		System.out.println("Resultado suma= "+ (a+b+c));
	}

	@Override
	public void tomarFotos() {
		System.out.println("Tomando una instantanea...");
		
	}
	
	
}
