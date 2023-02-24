package com;

public class Chocolate {

	
	private String sabor;
	private String tipo;
	private String forma;
	
	public Chocolate() {}
	public Chocolate(String sabor, String tipo, String forma) {
		
		this.sabor = sabor;
		this.tipo = tipo;
		this.forma = forma;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Chocolate [sabor=" + sabor + ", tipo=" + tipo + ", forma=" + forma + "]";
	}
	
	
	
	
}
