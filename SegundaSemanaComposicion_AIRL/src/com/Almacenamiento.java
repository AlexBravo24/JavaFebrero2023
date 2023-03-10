package com;

public class Almacenamiento {
	private String marca;
	private String tipo;
	private double capacidad;
	private double tamaņoFisico;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String tipo, double capacidad, double tamaņoFisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.tamaņoFisico = tamaņoFisico;
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

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getTamaņoFisico() {
		return tamaņoFisico;
	}

	public void setTamaņoFisico(double tamaņoFisico) {
		this.tamaņoFisico = tamaņoFisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", tamaņoFisico="
				+ tamaņoFisico + "]";
	}
	
	
	
	

}
