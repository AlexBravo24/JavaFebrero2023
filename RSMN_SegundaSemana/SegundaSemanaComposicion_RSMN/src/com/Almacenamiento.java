package com;

public class Almacenamiento {
	
	

	private String marca;
	private String tipo;
	private double capacidad;
	private double tamañoFisico;
	
	public Almacenamiento() {
	}
	
	public Almacenamiento(String marca, String tipo, double capacidad, double tamañoFisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.tamañoFisico = tamañoFisico;
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
	public double getTamañoFisico() {
		return tamañoFisico;
	}
	public void setTamañoFisico(double tamañoFisico) {
		this.tamañoFisico = tamañoFisico;
	}
	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", tamañoFisico="
				+ tamañoFisico + "]";
	}
	
	


	
}

