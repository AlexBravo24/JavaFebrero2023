package com;

public abstract class Calculadora {

	private String marca;
	private double precio;
	
	public Calculadora () {}

	public Calculadora(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	public abstract void sumar (int a, int b);
	public abstract void restar (int a, int b);
	public abstract void multiplicar (int a, int b);
	public abstract void multiplicar ();
	public abstract void multiplicar (int a, int b, int c);
	public abstract void dividir (int a, int b);
	
}
