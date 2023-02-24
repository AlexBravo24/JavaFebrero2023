package com;

public class Zapato {
	private String tipo_zapato;
	private String color;
	private double numero;
	private String marca;
	
	public Zapato() {
		
	}

	public Zapato(String tipo_zapato, String color, double numero, String marca) {
		this.tipo_zapato = tipo_zapato;
		this.color = color;
		this.numero = numero;
		this.marca = marca;
	}

	public String getTipo_zapato() {
		return tipo_zapato;
	}

	public void setTipo_zapato(String tipo_zapato) {
		this.tipo_zapato = tipo_zapato;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Zapato [tipo_zapato=" + tipo_zapato + ", color=" + color + ", numero=" + numero + ", marca=" + marca
				+ "]";
	}
	
	

}
