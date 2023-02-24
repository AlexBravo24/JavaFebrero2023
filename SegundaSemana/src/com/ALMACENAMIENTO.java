package com;

public class ALMACENAMIENTO {
        
	   private String marca;
	   private String tipo;
	   private String capacidad;
	   private double tama�oFisico;
	   
	   public ALMACENAMIENTO() {
			
		}
	   
	public ALMACENAMIENTO(String marca, String tipo, String capacidad, double tama�oFisico) {
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.tama�oFisico = tama�oFisico;
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

	public double getTama�oFisico() {
		return tama�oFisico;
	}

	public void setTama�oFisico(double tama�oFisico) {
		this.tama�oFisico = tama�oFisico;
	}

	@Override
	public String toString() {
		return "ALMACENAMIENTO [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", tama�oFisico="
				+ tama�oFisico + "]";
	}
	   
	
	   
	   

}
