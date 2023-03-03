package com;

public class Zapato {

	private String tipo;
	private int numero;

	private String marca;
	private String color;
	private static int precio = 300;
	
	
	public Zapato() {
		
	}


	public Zapato(String tipo, int numero, String marca, String color) {
		
		this.tipo = tipo;
		this.numero = numero;
		this.marca = marca;
		this.color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public static int getPrecio() {
		return precio;
	}


	public static void setPrecio(int precio) {
		Zapato.precio = precio;
	}


	@Override
	public String toString() {
		return "Zapato [tipo=" + tipo + ", numero=" + numero + ", marca=" + marca + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
}
