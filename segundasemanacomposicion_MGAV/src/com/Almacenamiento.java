package com;

public class Almacenamiento {
	
	
	private String marca;
	 private String tipo;
	 private double capacidad;
	 private double Tama�ofisico;
	
	 public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String tipo, int capacidad, double tama�ofisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		Tama�ofisico = tama�ofisico;
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

	

	public double getTama�ofisico() {
		return Tama�ofisico;
	}

	public void setTama�ofisico(double tama�ofisico) {
		Tama�ofisico = tama�ofisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", Tama�ofisico="
				+ Tama�ofisico + "]";
	}
	
	

}
