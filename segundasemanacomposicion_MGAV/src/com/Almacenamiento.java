package com;

public class Almacenamiento {
	
	
	private String marca;
	 private String tipo;
	 private double capacidad;
	 private double Tamañofisico;
	
	 public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String tipo, int capacidad, double tamañofisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		Tamañofisico = tamañofisico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
		
	}
	
	
	public double getCapacidad() {
		return capacidad;
	}

	

	public double getTamañofisico() {
		return Tamañofisico;
	}

	public void setTamañofisico(double tamañofisico) {
		Tamañofisico = tamañofisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", Tamañofisico="
				+ Tamañofisico + "]";
	}
	
	

}
