package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private String color;
	
	
	
	//constructores
	
	public Calculadora() {
		
	}
	

	
	public Calculadora(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}




	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}


	

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}



	public abstract double suma(double num1, double num2);
	
	public abstract double resta(double num1, double num2);
	
	public abstract double producto(double num1, double num2);
	
	public abstract double division(double num1, double num2);
	
	

}
