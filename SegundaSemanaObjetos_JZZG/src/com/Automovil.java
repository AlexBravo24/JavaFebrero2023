package com;

public class Automovil {

	private String agencia;
	private String tipo;
	private String a�o;
	private String color;
	private String transmision;
	private int    numventana;

	
	public Automovil() {
		
			
	}


	public Automovil(String agencia, String tipo, String a�o, String color, String transmision, int numventana) {
		super();
		this.agencia = agencia;
		this.tipo = tipo;
		this.a�o = a�o;
		this.color = color;
		this.transmision = transmision;
		this.numventana = numventana;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getA�o() {
		return a�o;
	}


	public void setA�o(String a�o) {
		this.a�o = a�o;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTransmision() {
		return transmision;
	}


	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}


	public int getNumventana() {
		return numventana;
	}


	public void setNumventana(int numventana) {
		this.numventana = numventana;
	}


	@Override
	public String toString() {
		return "Automovil [agencia=" + agencia + ", tipo=" + tipo + ", a�o=" + a�o + ", color=" + color
				+ ", transmision=" + transmision + ", numventana=" + numventana + "]";
	}

	
	
	
}
