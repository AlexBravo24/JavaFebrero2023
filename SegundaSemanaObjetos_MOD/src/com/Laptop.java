package com;

public class Laptop {

	//Atributos
	
	private String marca;
	private String procesador;
	private String memoriRAM;
	private String almacenamiento;
	private double precio;
	
	//Constructores
	public Laptop() {
	
	}
	
	public Laptop(String marca, String procesador, String memoriRAM, String almacenamiento, double precio) {
	
		this.marca = marca;
		this.procesador = procesador;
		this.memoriRAM = memoriRAM;
		this.almacenamiento = almacenamiento;
		this.precio = precio;
	}
	
	//getters and setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getMemoriRAM() {
		return memoriRAM;
	}
	public void setMemoriRAM(String memoriRAM) {
		this.memoriRAM = memoriRAM;
	}
	public String getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//método toString
	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", procesador=" + procesador + ", memoriRAM=" + memoriRAM
				+ ", almacenamiento=" + almacenamiento + ", precio=$" + precio + "]";
	}
	
	
}
