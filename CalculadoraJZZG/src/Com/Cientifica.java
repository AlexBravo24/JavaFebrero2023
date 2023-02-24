package Com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements Icamara{
	
	public Cientifica() {
		super();
		
	}

	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println("la suma es:"+(a+b));
		
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("la resta es:"+(a-b));
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("la multiplicacion es:"+(a*b));
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("la division es:"+(a/b));
	}

	@Override
	public void multiplicar(){
		int a,b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("intoduce el primer num");
		a=entrada.nextInt();
		System.out.println("intoduce el segundo num");
		b=entrada.nextInt();
		
		entrada.close();
		System.out.println("resultado de multiplicar ="+ (a*b));
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		
		System.out.println("la multiplicacion es:"+(a*b*c));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomarfoto() {
		
		System.out.println("tomando foto:::");
		// TODO Auto-generated method stub
		
	}
	
	

}
