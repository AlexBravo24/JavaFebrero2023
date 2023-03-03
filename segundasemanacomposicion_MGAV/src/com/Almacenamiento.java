package com;

public class Almacenamiento {
	
	
	private String marca;
	 private String tipo;
	 private double capacidad;
	 private double Tamaņofisico;
	
	 public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String tipo, int capacidad, double tamaņofisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		Tamaņofisico = tamaņofisico;
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

	

	public double getTamaņofisico() {
		return Tamaņofisico;
	}

	public void setTamaņofisico(double tamaņofisico) {
		Tamaņofisico = tamaņofisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", Tamaņofisico="
				+ Tamaņofisico + "]";
	}
	
	

}
