package com;

public class Laptop {
	
	
	 //Declaramos atributos propios 
	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	//Declaramos objetos Externos;
	private RAM ram;
	private ALMACENAMIENTO disco;
	private PROCESADOR cpu;
	
    public Laptop() {}

	public Laptop(String marca, String modelo, double precio, String color, RAM ram, ALMACENAMIENTO disco,
			PROCESADOR cpu) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public ALMACENAMIENTO getDisco() {
		return disco;
	}

	public void setDisco(ALMACENAMIENTO disco) {
		this.disco = disco;
	}

	public PROCESADOR getCpu() {
		return cpu;
	}

	public void setCpu(PROCESADOR cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ",\nram="
				+ ram + ",\ndisco=" + disco + ",\ncpu=" + cpu + "]";
	}
    
    
	

}
