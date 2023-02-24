package com;

public class Laptop {

	
	//Atributos
	
	private String marca;
	private String procesador;
	private int ram;
	private int capacidadHD;
	private String sistema;
	
	
	
	//Constructores
	
	public Laptop() {
		
	}
	
	public Laptop(String marca, String procesador, int ram, int capacidadHD) {
		this.marca = marca;
		this.procesador = procesador;
		this.ram = ram;
		this.capacidadHD = capacidadHD;
	}
	
	
	//Getters y Setters

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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getCapacidadHD() {
		return capacidadHD;
	}

	public void setCapacidadHD(int capacidadHD) {
		this.capacidadHD = capacidadHD;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", procesador=" + procesador + ", ram=" + ram + ", capacidadHD=" + capacidadHD
				+ ", sistema=" + sistema + "]";
	}
	
	
	
	
	
	
	
}
