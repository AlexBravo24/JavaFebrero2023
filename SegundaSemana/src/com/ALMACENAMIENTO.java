package com;

public class ALMACENAMIENTO {
        
	   private String marca;
	   private String tipo;
	   private String capacidad;
	   private double tamañoFisico;
	   
	   public ALMACENAMIENTO() {
			
		}
	   
	public ALMACENAMIENTO(String marca, String tipo, String capacidad, double tamañoFisico) {
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

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
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
		return "ALMACENAMIENTO [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", tamañoFisico="
				+ tamañoFisico + "]";
	}
	   
	
	   
	   

}
