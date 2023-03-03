package com;

public class Cientifica extends Calculadora implements ICamara{

	//sin atributos
	
	
	
	//constructores
	public Cientifica() {
		
	}
	
	
	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}
	


	//implementacion de metodos abstractos



	@Override
	public double suma(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public double resta(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public double producto(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public double division(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}


	@Override
	public void tomarFoto() {
		System.out.println("tomando foto... ");
		
	}
	
	
	

}
