package com;

public class Computadora {
	
	private String tipo;
	private int ram;
	private double memoria;
	private String color;
	private String marca;
	private final int precio = 3564;
	
	
	
	public Computadora() {
		
	}



	public Computadora(String tipo, int ram, double memoria, String color, String marca) {
		
		this.tipo = tipo;
		this.ram = ram;
		this.memoria = memoria;
		this.color = color;
		this.marca = marca;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public double getMemoria() {
		return memoria;
	}



	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getPrecio() {
		return precio;
	}



	@Override
	public String toString() {
		return "Computadora [tipo=" + tipo + ", ram=" + ram + ", memoria=" + memoria + ", color=" + color + ", marca="
				+ marca + ", precio=" + precio + "]";
	}



	
	
}
