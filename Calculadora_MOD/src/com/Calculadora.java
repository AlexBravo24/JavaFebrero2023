package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private String color;
	
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
	public abstract void suma(int a, int b);
	public abstract void resta(int a, int b);
	
	public abstract void multiplicacion(int a, int b);
	// Declaro otro metodo de multiplicar, pero en este pedire valores por teclado
	public abstract void multiplicacion();
	//multiplicacion de 3 argumentos
	//A esto se le llama polimorfismo sobrecarga de metodos - sobreescritura
	//Sobrecarga de metodos (argumentos) se genera cuando una clase tiene varios metodos con el mismo nombre, 
	//pero tiene diferentes parametros y diferentes acciones dentro del metodo
	public abstract void multiplicacion(int a, int b, int c);
	public abstract void division(int a, int b);
}
