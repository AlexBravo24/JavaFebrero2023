package com;

public class Producto {
	
	//Objeto cuenta
	//Atributos
	
	private String numproducto;
	private  double costo;
	private  double existencia;
	
	public Producto() {}

	public Producto(String numproducto, double costo, double existencia) {
		this.numproducto = numproducto;
		this.costo = costo;
		this.existencia = existencia;
		
	}

	public String getNumproducto() {
		return numproducto;
	}

	public void setNumproducto(String numproducto) {
		this.numproducto = numproducto;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getExistencia() {
		return existencia;
	}

	public void setExistencia(double existencia) {
		this.existencia = existencia;
	}


	@Override
	public String toString() {
		return "Producto [numproducto=" + numproducto + ", costo=" + costo + ", existencia=" + existencia
				+ "]";
	}

	

	


}
